package abstraction;

public class TV extends ProductSpec {
	// 주어진 것만 하라고 했으면 ProductSpec 마무리
	// 그런데, 추가정보를 더하라고 했으면 상속
	private String screenSize;
	private String screenType;
	
	public void writeInfo(String company,
			String name,
			String serialNo,
			String screenSize,
			String screenType) { // private은 클래스 내부에서만 접근가능!
			super.writeInfo(company, name, serialNo);
			// 부모에게 선언된 public 메소드에 접근 , 사용가능
			// super라는 키워드를 통해서
			this.screenSize = screenSize;
			this.screenType = screenType;
		//super.writeInfo(company, name, serialNo); --> productspec에 있는 writeinfo를 그대로 쓸지 물어보는 것.!
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("스크린사이즈 :" +this.screenSize);
		System.out.println("스크린타입 :" +this.screenType);
	}
}
