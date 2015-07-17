package encapsulation;

public class CardBean2 {
	
	private int card1 , card2;
	private String name, name2; // winner 라고 추가한후 getwinner를 불러놓은 후 winner를 없애면된다.
	
	public void setCard1() {
		this.card1 = (int) ((Math.random()*13)+1);	
	}
	
	public void setCard2() {
		//외부에서 받는 숫자가 없으므로 파라미터가 필요없다.
		this.card2 = (int) ((Math.random()*13)+1);
		//1부터 13까지의 정수 중에서 랜덤 숫자를 리턴
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setName2(String name2) {
		this.name2 = name2;
	}
	
	public String getWinner() {
		//getter 에서 문제해결 패턴
		//제일 먼저 리턴타입을 카피
		String winner = "";
		if (this.card1>this.card2) {
			winner = name+"승리";
		}else if (this.card1<this.card2) {
			winner = name2+"승리";
		} else {
			winner = "비김";
		}
		return winner;
	}
	
	@Override
	public String toString() {
		return "["+name+" :"+ card1+"] vs ["+name2+" :"+ card2+"]\n"
				 +this.getWinner();
	}
	
}
