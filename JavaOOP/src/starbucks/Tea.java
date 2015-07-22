package starbucks;

public class Tea extends Coffee {
	private int option;
	private String msg;
	
	@Override
	public void brew() {
		System.out.println("2.티백을 넣는다");
	}
	
	public void select(int option){
		this.option = option;
		switch (option) {
		case 1:
			msg = "레몬티";
			break;
		case 2:
			msg= "자몽티";
			break;
		default:
			msg = "없는티";
			break;
		}
	}
	
	public void serve() {
		System.out.println("손님"+msg+"가 나왔습니다.");
		
	}
}
