package encapsulation;

import java.util.Scanner;

/*
 * @ Date : 2015.07.14
 * @ Author : Jin
 * @ Story : 카우프지수 프로그램을 객체화 하는 예제
 * */
public class KaupBean4 {

	private String name, msg;
	private double height, weight;
	private int idx;

	/*
	 * 스케너가 입력받은 값을 저장하는 메소드가 필요해졌다. 이를 setter 메소드라고 합니다.
	 *  그리고 이 setter 메소드는
	 *  set+ 멤버필드()로 이름이 자동 생성됩니다.
	 *  setter 는 write의 의미입니다.
	 */

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void getIndex() { // method(동사)
		// void는 return값이 없다 (return값이 없다는 의미)

		idx = (int) ((weight / (height * height)) * 10000);
		// 범위값으로 인해 if를 사용함 (switch의 경우는 확실한 값일때)
		if (idx > 30) {
			msg = "비만";
		} else if (idx > 24) {
			msg = "과체중";
		} else if (idx > 20) {
			msg = "정상";
		} else if (idx > 15) {
			msg = "저체중";
		} else if (idx > 13) {
			msg = "마름";
		} else {
			msg = "영양실조";
		}
	}

	@Override
	public String toString() {

		// 선언부
		String str = ""; // 지역변수는 무조건 초기화
		// 연산부
		str = "[" + name + "] 키:" + height + "cm,+ " + "몸무게 : " + weight + "kg, 카우푸지수 :" + msg;
		// 출력부
		return str; // 출력부의 역할은 return으로 대체.
	}
}
