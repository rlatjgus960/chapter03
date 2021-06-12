package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {
		// String s01 = "안녕하세요";
		String s01 = new String("hi");
		String s02 = new String("hi"); // 힙에 메모리 올려줌

		System.out.println(s01 == s02); // 주소 다르므로 false, 단순비교, 기본자료형은 보통 사용가능함

		// s01 = null; // 강제로 주소 비우기
		System.out.println(s01.equals(s02)); // 논리적인 비교, 기본자료형이 아닐 때

		String s03 = "hello"; // new String("hello") 를 약식으로 사용 가능함
		String s04 = "hello"; // new String("hello")

		System.out.println(s03 == s04); // 주소비교, false 나올거같은데 true 나옴
		// String을 약식으로 쓰면 작동원리가 살짝 달라진다

		System.out.println(s03);
		System.out.println(s04);
		System.out.println("-----------------------");

		s03 = "hello!!!!!!!!!!";

		System.out.println(s03 == s04);
		System.out.println(s03);
		System.out.println(s04); 
		
		String s05 = "황일영";
		
		
		

	}

}
