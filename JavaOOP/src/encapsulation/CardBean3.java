package encapsulation;
/*
 * @ Date : 2015.07.15
 * @ Author : Jin
 * @ Story : 생성자 문법
 * 생성자는 setter를 통해 값을 할당하는
 * 기능을 보강하여, 객체가 만들어짐과 동시에
 * 값을 할당하도록 특수하게 만들어진 ★메소드!!
 * */
public class CardBean3 {
/*===== field =====*/	
	private int card1 , card2;
	private String name, name2; 
/*===== Constructor =====*/
	//생성자 위치는 (멤버)필드와 메소드 영역 사이에 위치
	//생성자 모양
	//public 클래스 이름(){}
	public CardBean3(){} // 디폴트 생성자 
	
	public CardBean3(String name) {
		// setter 역할을 겸용하는 생성자
		this.name = name;
		this.card1 = (int) ((Math.random()*13)+1);
	// TODO Auto-generated constructor stub
	}
	// 디폴트 생성자는 개발자가 직접 만들지 않아도 
	// 프로그램 내부에서는 생성되 있는 것으로 인식한다.
	// 그런데,  이것을 꺼내 든 이유는 
	// new 키워드를 통한 객체생성 역할뿐 아니라
	// 생성과 동시에 값을 할당하는 기능을 추가 시키기 위해서...
	
/*===== Method =====*/

	public String getName() {
		return name;
	}
	public int getCard1() {
		return card1;
	}
	
	public String getWinner() {
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
