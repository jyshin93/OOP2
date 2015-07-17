package encapsulation;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name ="", msg="";
		double height = 0.0d, weight= 0.0d;
		int idx=0; //카우푸 인덱스
		//연산부
		System.out.println("이름입력:");
		name = scanner.next();
		System.out.println("몸무게를 입력하세요:");
		weight = scanner.nextDouble();
		System.out.println("키를 입력하세요:");
		height = scanner.nextDouble();
		
		KaupBean4 bean = new KaupBean4();
		bean.setName(name);
		bean.setHeight(height);
		bean.setWeight(weight);
		bean.getIndex();
		//출력부//
		System.out.println(bean.toString());
	}
}
