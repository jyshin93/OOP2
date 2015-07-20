package inhabitance;

import java.util.Scanner;

public class IphoneMain {
	public static void main(String[] args) {
		/*
		 [콘솔출력문]
		 아이폰을 사용해서
		 폰을 가지고 다닐 수 있음...
		 홍길동에게 전화를 검
		 홍길동에게 데이터를 전달
		 * */
		//아이폰이 출려되게 하려면
		//클래스변수(=스태틱변수)는
		//클래스이름.Brand로 가져오면 됩니다.
		Scanner scanner =  new Scanner(System.in);
		// 클래스명, 필드명 ... get/set없이 사용하는 이유는
		// 은닉화가 필요없는 고정된 값이기 때문에
		// Iphone.BRAND 식으로 사용해야 한다.
		Iphone iphone = new Iphone();
		iphone.setCompany(Iphone.BRAND); // ()클래스 이름 . BRAND 또는 TRUE
		iphone.setPortable(Iphone.TRUE); // 무조건 애플은 이동전화만 만든다.
		
		System.out.println("통화상대 입력:");
		String name = scanner.next();
		iphone.setCall(name);
		System.out.println("보내는 메시지 입력 :");
		iphone.setData(name, scanner.next());
		// 기존에 자동생성된 set을 파라미터가 2개인 메소드로 저장.
		System.out.println(iphone.getCompany()+ "을 사용해서");
		System.out.println(iphone.getMove());
		System.out.println(iphone.getCall());
		System.out.println(iphone.getData());
		
		
	}
}
