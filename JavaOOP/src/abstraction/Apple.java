package abstraction;

public class Apple implements FruitsInterface {
	/*=== Field ===*/
	/*=== Constructor ===*/
	public Apple() {
	}
	/*=== Member Method*/
	@Override
	public void display(String str) { //자동 완성 시키기
		System.out.println(str + "사과입니다");
		
	}

}
