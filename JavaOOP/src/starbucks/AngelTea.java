package starbucks;
/*
 extends 는 컨트롤 + 스페이스 로
 @Override 를 호출하라고 했는데..
 그것은 extends 클래스가 일반클래스인 경우이고
 추상클래스는 일반클래스 + 인터페이스 형태이므로
 인터페이스의 특징을 갖게 됩니다.
 따라서, extends이지만 부모클래스가 추상클래스라면
 unimplements를 해줘야 합니다.
 * */
public class AngelTea extends DrinkRecipe{
	private String tea;
	@Override
	void brew() {
		System.out.println("2.티백을 넣는다");
		
	}

	@Override
	void select(int option) {
		switch (option) {
		case 1:
			this.tea = "레몬티";
			break;
		case 2:
			this.tea= "자몽티";
			break;
		default:
			this.tea = "없는티";
			break;
		}
		
	}

	@Override
	void serve() {
		System.out.println("손님"+this.tea+"가 나왔습니다.");
				
	}

}
