package encapsulation;

public class BlueMain {
	public static void main(String[] args) {
		Dice Dice1 = new Dice(0);
		Dice Dice2 = new Dice(0);
		Blue blue = new Blue(Dice1, Dice2);
		
		
		//클래스이름 객체이름 = new 생성자() ==> 인스턴스 생성 공식
		System.out.println(blue.toString());
		
	}
}
