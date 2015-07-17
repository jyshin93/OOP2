package encapsulation;

import javax.annotation.Generated;

//card game에 해당
public class Blue {
/*======Field==========*/
	// 주사위 두개의 값의 합
	private int sum;
/*======= Constructor =========*/
	public Blue(Dice dice1, Dice dice2){
		int sum = 0;
		sum = dice1.getDice()+dice2.getDice();
		this.sum = sum;
	}
	public int getSum() {
		return sum;
	}
	@Override
	public String toString() {
		return "두 Dice의 합이"+ this.sum+"이니" +this.sum+"칸 전진";
	}
}
