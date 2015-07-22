package starbucks;

import java.util.Scanner;

public class Angel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*AngelCoffee kim = new AngelCoffee(); //김씨를 위한 커피
		System.out.println("4. 설탕을 첨가 하시겠습니까? 1.무설탕 2.설탕");
		kim.prepare(scanner.nextInt());*/
		AngelTea lee = new AngelTea();
		System.out.println("1.레몬티 2.자몽티");
		lee.prepare(scanner.nextInt());
	}
}
