package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {

		Integer i01 = new Integer(10);
		Integer i02 = new Integer(7);

		// int result = 10 + 7;
		// Integer result = new Integer(10) + new Integer(7);
		Integer result = i01 + i02;
		System.out.println(result);

		int i10 = 7; // i10. <--값이 들어있음
		i01.intValue(); // 메소드 사용할 수 있다.

		// 박싱
		Integer i11 = 10; // Integer i11 = new Integer(10);

		// 언박싱
		int i101 = i11; // 언박싱해서 i101에 값만 넣어준것
		System.out.println(i101);

		System.out.println("-문자열-->정수----------------");

		Integer i999 = new Integer(999); // 문자-->정수 변환을 위해 만들어진 쓸데없는 변수
		int num = i999.parseInt("12345");
		System.out.println(num);

		// 실제사용
		int num2 = Integer.parseInt("12345");
		System.out.println(num2);

		// 정수-->문자열로
		String str = new String("hi");
		String strResult = str.valueOf(123456);
		System.out.println(strResult);

		// 정수-->문자열로 실제사용
		String strResult2 = String.valueOf(123456);
		System.out.println(strResult2);

		// 정수-->문자열로 이거 많이 사용
		String strResult3 = "" + 9876; // 9876-->"9876"
		System.out.println(strResult3);

		String yn = "y"; // 사용자가 입력한값
		// String yn = new String("y");
		// yn=null;

		// String retry = "y";

		if (yn.equals("y")) { // null포인트 상황이 발생할 수 있다.
			System.out.println("게임다시시작");
		}

		// equals 사용 팁
		if ("y".equals(yn)) { // 문자열을 앞에 써줘서 null포인트 상황이 발생하지 않는다.
			System.out.println("게임다시시작");
		}
		
		//다른 기본 자료형
		Byte b = new Byte((byte)3); //3을 int로 인식하기 때문에 형변환시켜서 넣어야됨
		Short s = new Short((short)1);
	}

}
