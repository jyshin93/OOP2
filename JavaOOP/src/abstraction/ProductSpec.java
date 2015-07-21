package abstraction;
/*
 인터페이스인 Product 를 구현
 * */
public class ProductSpec implements Product {
	/*=== 필드 ===*/
	private String company; //제조사
	private String name; //제품명
	private String serialNo; //시리얼 넘버
	/*=== 생성자 ===*/
	/*=== 멤버메소드 ===*/
	 //get/set을 할수있으나 두개의 메소드에 때려박겠다.
	 //get/set과 생성자를 이용하지않고 정보를 받아올수 있는 것은 interface때문.
	@Override
	public void showInfo() {
		System.out.println("제조사 :" +this.company);
		System.out.println("제품명 :" +this.name);
		System.out.println("시리얼넘버 :" +this.serialNo);
	}
	@Override
	public void writeInfo(String company, String name, String serialNo) {
		this.company = company; //파랑색은 필드변수(인스턴스의 변수) 황색글씨는 파라미터로 넘어온 지변
		this.name=name;
		this.serialNo = serialNo;
	}
	
}
