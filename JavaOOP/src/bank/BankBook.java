package bank;

public class BankBook {
	public static String BANK ;
	private int bankbookNo;
	private String name;
	private int money, pass;
	private String msg; 
/*=====Constructor=====*/
	public BankBook(String name) { 
		this.BANK = "아이티뱅크";
		
		this.bankbookNo = (int) ((Math.random()*99999)+10000);
		this.name = name;
	}
	
/*=====Member Method=====*/
	

	public void setPass(int pass) {
		this.pass = pass;
	}
	
	public String showAccount() { 
		
		return "===============\n"
				+ "["+BANK+"]\n"
				+ "계좌번호 : "+bankbookNo+"\n"
				+ "이름:" +name+"\n"
				+ "잔액: "+money+"\n"
				+ "===============";
	}
	
	public void withdraw(int money) {
	
		if (money <=0) {
			msg = "출금액은 0보다 커야합니다.";
		}else if (this.money < money) {
			msg = "출금액이 잔액보다 큽니다";
		}else {
			this.money -= money; //누적된 값에서 마이너스
		}
		
	}
	
	public void deposit(int money) {
		if (money<=0) {
			msg = "입금은 0보다 커야합니다.";
		}else {
			this.money += money; //누적된 값에서 플러스
		}
		
	}

	public int getBankbookNo() {
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

	public String getMsg() {
		return msg;
	}

	public void setBankbookNo(int bankbookNo) {
		this.bankbookNo = bankbookNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	


}
