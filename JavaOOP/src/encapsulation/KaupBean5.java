package encapsulation;

import java.util.Scanner;

/*
 * @ Date : 2015.07.14
 * @ Author : Jin
 * @ Story : 카우프지수 프로그램을 객체화 하는 예제
 * */
public class KaupBean5 {

	private String name, msg;
	private double height, weight;
	private int idx;

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	/*
	 멤버필드에 값을 저장하는 메소드가 setter 라면
	 값을 읽어 오는 메소드는 getter라고 합니다.
	 getter 는 read 의 의미입니다.
	 getter 의 특징은 리턴타입이 존재합니다.
	 그리고 특별한 상황이 아니라면 파라미터가
	 존재하지 않습니다.
	 * */
	
	public String getMsg() {
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
		return msg;
	}
		
	

	@Override
	public String toString() { //바깥으로 나타내지는 타입

		// 선언부
		String str = ""; // 지역변수는 무조건 초기화
		// 연산부
		str = "[" + name + "] 키:" + height + "cm,+ " + "몸무게 : " + weight + "kg, 카우푸지수 :" + getMsg();
		// 출력부
		return str; // 출력부의 역할은 return으로 대체.
	}
}
