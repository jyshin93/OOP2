package encapsulation;

public class CardBean {
	
	private int card1 , card2;
	private String name, name2; // winner 라고 추가한후 getwinner를 불러놓은 후 winner를 없애면된다.
	
	public void setCard1(int card1) {
		this.card1 = card1;	
	}
	
	public void setCard2(int card2) {
		this.card2 = card2;
	}

	public void setName(String name) {
		// ()안에 값을 파라미터하고 소속은 지변
		this.name = name;
		//this.name은 인스턴스 변수(멤변)이고
		// = name 은 파라미터로 넘어온 지변(스캐너가 받은 값)
		// 스캐너가 받아 논 값을 가진 지변값을
		// 멤변 name에 할당하라.
		// 파라미터값과 멤변값의 이름은 달라도 상관없다.
		// 단, 데이터타입(String, int) 은 반드시 일치해야 한다.
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
