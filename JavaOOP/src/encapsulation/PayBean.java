package encapsulation;

public class PayBean {
	//메소드는 선언부, 연산부, 출력부 이렇게 나누고
	// Bean 클래스라면 멤버필드 + 멤버메소드
	
	private String name; //멤버필드의 변수는 초기화를 하지 않는다!!!!!!!!!!!
	private int income; //get Tax와 get net은 받지않기때문에 memory를 차지할 필요가없다.
	
	//멤버 메소드 영역의 시작
	// scanner로 받는것은 setter이다
	// 계산을 통해서 toString으로 결과값을 출력을 해야하는 경우는 getter
	public void setName(String name) {
		this.name = name;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public int getTax() {
		int tax = 0; // 지변은 초기화 필수!!
		tax = (int) (income*0.1);
		return tax;
	}
	/*
	 * this는 이 클래스 내부에 있는 ~~~ 의 의미.
	 * */
	public int getNet() {
		int net=0; //지변 초기화
		net = income - this.getTax();
		return net;
	}
	public String getName() {
		return name;
	}
	
	@Override //무조건 만들어줘야하는 toString
	public String toString() {
	
		return "["+this.name+"] 실급여\n"+
				"월급:"+this.income+"만원\n"
	  			+"세금:"+this.getTax()+"만원\n"
	  			+ "실급여:"+this.getNet()+"만원";
	}
}
