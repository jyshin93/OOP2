package encapsulation;

import java.util.Scanner;

public class CardMain2 {
	public static void main(String[] args) {
		/*
		 [오더]
		 카드 두장을 비교해서 카드 번호가
		 더 큰 수가 이기는 게임 프로그램을 작성하시오.
		 일단, 프로토타입(시제품) 프로그램으로
		 개발자가 임의의 숫자를 입력하면
		 [출력]
		 [홍길동 : 7] vs [김유신 : 3]
		 홍길동 승리
		 * */
		Scanner scanner =  new Scanner(System.in);
		System.out.println("이름을 입력");
		CardBean3 hong = new CardBean3(scanner.next());
		//숫자를 랜덤으로 들어오게하기 위해 scanner지움
		System.out.println("이름2:");
		CardBean3 kim = new CardBean3(scanner.next());
		CardGame game = new CardGame(hong,kim); 
		
		System.out.println(game.toString());
		
		// 객체를 생성함
		
	
				
		//System.out.println(hong.getName()+":"+hong.getCard1());
		//System.out.println(kim.getName()+":"+kim.getCard1());
	}
}
