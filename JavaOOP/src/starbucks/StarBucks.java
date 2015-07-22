package starbucks;

import java.util.Scanner;

public class StarBucks {
	public static void main(String[] args) {
		/*
		 인터페이스를 구현한 클래스의 객체 생성문법
		 인터페이스 인스턴스 = new 생성사();
		 * */
		Recipe coffee = new Coffee();
		Recipe tea = new Tea();
		Scanner scanner = new Scanner(System.in);
		
		coffee.boilWater();
		coffee.brew();
		coffee.pourInCup();
		System.out.println("4. 설탕을 첨가 하시겠습니까? 1.무설탕 2.설탕");
		coffee.select(scanner.nextInt());
		coffee.serve();
		
		
		tea.boilWater();
		tea.brew();
		tea.pourInCup();
		System.out.println("레몬 또는 자몽을 첨가? 1.레몬 2.자몽");
		tea.select(scanner.nextInt());
		tea.serve();
	}
}
