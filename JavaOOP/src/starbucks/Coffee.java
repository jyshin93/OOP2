package starbucks;

public class Coffee implements Recipe {
	private int option;
	private String msg;
	@Override
	public void boilWater() {
		System.out.println("1.물을 끓인다");
	}

	@Override
	public void brew() {
		System.out.println("2.커피를 내린다");
	}

	@Override
	public void pourInCup() {
		System.out.println("3.물을 컵에 붓는다");
	}

	@Override
	public void select(int option) {
		
		this.option = option;
		if (option == 1) {
			msg = "블랙";
		}else if (option == 2) {
			msg = "밀크";
		}else {
			msg = "취급하지 않는 커피입니다.";
		}
	}

	@Override
	public void serve() {
		System.out.println("고객님["+msg+"]커피가 나왔습니다");
	}

	
}
