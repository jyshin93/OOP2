package encapsulation;

import abstraction.Account;

/*
 객체지향 프로그래밍에서 클래스는 현실세계를 그대로 카피하려고 한다.
 그 대상이 구체적 물질이든 개념적 추상이든 그대로 재현하려고 해야한다.
 통장을 이루는 요소를 생각해봅시다.
 그 요소가 결국 인스턴스 변수를 구성하게 됩니다.
 1. 은행이름 => 아이티뱅크 bank
 2. 통장번호 => 랜덤번호5자리의 랜덤숫자 bankbookno
 3. 소유자이름 => 생성자의 스캐너로 입력받는다 name
 4. 날짜예금액/출금액/잔액 => 스캐너로 입력 단 + - 가능하므로 숫자타입 int ==> money
 5. 비밀번호 => scanner로 입력받는 값. 숫자타입 4자리숫자 ==> pass
 
 [인터페이스]
 1. withdraw(int money) : void
 2. deposit(int money) : void
 [출력]
 =================
 [아이티뱅크]
 계좌번호 : 12345
 이름: 홍길동
 잔액: 10000원
 =================
 BankBook 이라는 클래스 라이브러리를
 NDriver 에서 다운받아서 사용하세요
 비번은 돈 먼저 입금하세요.
 * */
public class BankBook implements Account {
	
	// 상수 : final을 붙여서 절대 불변의 값
	// 스태틱 : final을 빼버리면 절대 불변의 값이 아니라
	//			바꿀수 있지만, 고정된 값 스태틱 값이 된다.
	// 스태틱 = 클래스변수
	// BankBook b = new BankBook();
	// b.bank ---> 인변이 값을 호출한 것
	// BankBook.bank ---> 클래스변수 호출하는 모양
	// 위치 : 필드 ---> {인변, 상수, 클래스변수} < 멤변, 
/*====== Field =====*/
	private static String BANK ; // 대문자로되어있으면 고정된 값으로 된다
	private int bankbookNo;
	private String name;
	private int money, pass;
	private String msg; //유효성 체크 결과를 알려줘서 고객이 만약 실수로 입력했다면
						//공지해주는 역할을 할 것이다.
/*=====Constructor=====*/
	public BankBook(String name) { //한번밖에 생성이 안되는 필드들은 constructor밖에서 setter나 getter로 받아들여야한다.
		this.BANK = "아이티뱅크";
		// 계좌번호는 5자리 숫자
		// 
		this.bankbookNo = (int) ((Math.random()*99999)+10000);
		this.name = name;//외부에서 받는 것은 parameter밖에없다.
	}
	//개발자는 setter를 쓸지, 생성자로 끝낼지를 고민한다.
	// getter setter 단축키 : Alt + SHIFT + S
	// 절대 바뀌면 안되는 변수는 Setter를 지워야한다!!!!!!!!!!!
	
/*=====Member Method=====*/
	public int  getBankbookNo() {
		return bankbookNo;
	}

	public String getName() {
		return name;
	}

	public int getMoney() {
		return money;
	}
	
	public int getPass() {
		return pass;
	}
	
	public void setPass(int pass) {
		this.pass = pass;
	}
	

	@Override
	public String toString() { //파라미터안에는 타입이 일치하는 것만 들어올수 있도록 해준다.
		
		return "===============\n"
				+ "["+BANK+"]\n"
				+ "계좌번호 : "+bankbookNo+"\n"
				+ "이름:" +name+"\n"
				+msg
				+ "잔액: "+money+"\n"
				+ "===============";
	}
	@Override
	public void withdraw(int money) {
		// parameter값이 정상값이 아닌 상태를
		// 추적해서 필터링 하는 로직이 필요하다.
		// ==> 유효성체크
		if (money <=0) {
			msg = "출금액은 0보다 커야합니다.";
		}else if (this.money < money) {
			msg = "출금액이 잔액보다 큽니다";
		}else {
			this.money -= money; //누적된 값에서 마이너스
		}
		
	}
	@Override
	public void deposit(int money) {
		if (money<=0) {
			msg = "입금은 0보다 커야합니다.";
		}else {
			this.money += money; //누적된 값에서 플러스
		}
		
	}
	
	
}
