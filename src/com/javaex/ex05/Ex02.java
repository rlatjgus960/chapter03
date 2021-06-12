package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {

		String a = new String(" abcd");
		String b = new String(",efg ");

		System.out.println(a.concat(b));
		System.out.println(a);
		System.out.println(b);
		System.out.println("--------------");

		a = a.concat(b); // 문자열 붙이기
		System.out.println(a);

		a = a.trim(); // 공백을 삭제
		System.out.println("----" + a + "----");
		System.out.println(a);

		a = a.replace("ab", "12"); // a의 ab를 12로 바꿔라
		System.out.println(a);

		System.out.println("--------------");

		String[] sArray = a.split(","); // , 기준으로 나눠주기
		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i]);
		}

		System.out.println("--------------");

		String str = "Hello java!";
		System.out.println(str.charAt(4)); //해당 번호의 문자 출력
		
		String result = str.substring(3); //해당 번호부터 끝까지 출력
		System.out.println(result); 
		
		String result2 = str.substring(3,8); //해당 번호부터 번호까지 출력
		System.out.println(result2); 
	}

}
