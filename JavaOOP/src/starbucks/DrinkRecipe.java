package starbucks;
/*
 추상 클래스
 - 추상메소드를 가지고 있는 것은
 인터페이스와 동일하나, 구상메소드({}를 가지고 있는것)
 도 추가로 가질 수 있고...
 객체 생성시 개발자 마음대로 메소드를 추가하여도
 문제가 없다.
 * */
public abstract class DrinkRecipe { // 추상메소드를 class에서 구현하려면 abstract를 public과 void사이에 삽입시킨다.
	public void prepare(int option){ // public으로 한개의 메소드를 주고 순서대로 나머지 정렬.
		boilWater();
		brew();
		pourInCup();
		select(option);
		serve();
	}
	private void boilWater(){
		System.out.println("물을 끓인다");
	}	
	// 추상메소드는 private 은 허용되지 않는다
	// 외부에서 접근 금지를 하려면 디폴트 상태(기본상태)로 둔다 public을 지우면 디폴트상태
	abstract void brew();
	private void pourInCup(){
		System.out.println("물을 컵에 붓는다");
	}
	abstract void select(int option);
	abstract void serve();
}
