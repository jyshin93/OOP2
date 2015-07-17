package encapsulation;
/*
 버전 업 
 현재는 홍길동 승 이라고 나오는데
 개선을 해달라고 합니다
 ===========
 홍길동:7
 김유신:4
 홍길동 승리
 ===========
 * */

public class CardGame {
	//생성자 단축키
	//CTRL + SPACE
	//===========Field============//
	private String winner, looser; //멤변선언
	private int winScore, looseScore;
	
/*===========Constructor===========*/	
	public CardGame() {//디폴트 생성자
		//hong과 kim을 가져와서 비교하기
		//this(null,null) //우리가 만든 class의 type 값은 null이라는 타입이다 
	}

	public CardGame(CardBean3 bean1, CardBean3 bean2) {//object는 최상위 객체
		String winner="", looser="";
		int winScore=0, looseScore=0;
		// 지역변수(로컬변수) 는 메모르 영역중에서 (콜)스텍에 저장
		// 인스턴스변수는 메모리 영역중에서 힙에 저장
		if (bean1.getCard1()>bean2.getCard1()) {
			winner = bean1.getName();
			looser = bean2.getName();
			winScore =bean1.getCard1();
			looseScore=bean2.getCard1();
		}else if (bean1.getCard1()<bean2.getCard1()) {
			winner = bean2.getName();
			looser = bean1.getName();
			winScore =bean2.getCard1();
			looseScore=bean1.getCard1();
		} else {
			winner = "비김";
		}
		this.winner = winner;
		this.looser = looser;
		this.winScore = winScore;
		this.looseScore = looseScore;
	}
	 

/*=======멤버메소드========*/
	@Override
	public String toString() {
		
		return "====================\n"+
				this.winner+":"+this.winScore+"\n"+
				this.looser+":"+this.looseScore+"\n"+
				this.winner+"승리\n"+
				"====================";
	}
}
