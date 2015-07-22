package inheritance;

public class Phone { // 
	/*=== 필드 ===*/
	private String company;
	private String call;
	/*=== 생성자 ===*/
	
	/*=== 멤버메소드 ===*/ //생성자가 없으면 무조건 setter를 만든다
	// Alt + SHIFT + S
	public String getCompany() {
		return company;
	}
	public String getCall() {
		return call;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setCall(String call) {
		this.call = call + "에게 전화를 검";
	}

	
}
