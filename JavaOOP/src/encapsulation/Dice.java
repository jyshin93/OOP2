package encapsulation;

public class Dice {
/*=========Field=========*/	
	private int Dice; // 주사위는 하나의 숫자만 갖는다
	
/*==========Constructor==========*/
	//생성자 단축키는 CTRL + SPACE
	public Dice(int Dice){
		this.Dice = (int) ((Math.random()*6)+1); //limit값 *뒤 숫자. Start값은 +뒤에 숫자
	}
/*======== MemberMethod========*/
	public int getDice() {
		return Dice;
	}
}
