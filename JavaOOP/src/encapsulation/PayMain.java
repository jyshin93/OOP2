package encapsulation;

import java.util.Scanner;

public class PayMain {
	public static void main(String[] args) {
		/*
		 [오더]
		 Pay 프로그램은 월급을 입력받아서
		 세금을 떼고 실급여를 고객에게 
		 알려주는 프로그램입니다.
		 세율은 10% 
		 출력문은
		 [홍길동 실급여]
		 월급 : 100 만원
		 세금 : 10만원
		 실급여 : 90만원
		 * */
		Scanner scanner = new Scanner(System.in);
		String name = "";
		int income =0, tax=0, net=0;
		System.out.println("이름 입력:");
		name = scanner.next();
		System.out.println("월급을 입력하세요");
		income = scanner.nextInt();
		
		
		PayBean payBean = new PayBean();
		payBean.setName(name);
		payBean.setIncome(income);
		
		
		System.out.println(payBean.toString());
		
	}
}
