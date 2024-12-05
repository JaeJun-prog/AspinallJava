package com.Aspinall.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_For1 {
	/*
	 * 2단을 출력 해보겠습니다.
	 * 2*1=2
	 * 2*2=4
	 * 2*3=6
	 * 2*4=8
	 * ...
	 * 
	 * 문제 1
	 * 정수 하나를 입력받아서 그 수가 1~9 사이의 수일때만
	 * 그 수의 구구단을 출력하세요.
	 * 단 조건이 맞지 않으면 "1 ~ 9 사이의 양수를 입력하여야 합니다"를 출력하세요
	 */
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		if(num < 1 || num > 9 ) { //OR 연산자를 이용하여 num이 1 ~ 9 사이의 수가 아니면 메세지 출력
			System.out.println("1 ~ 9 사이의 양수를입력하여야 합니다.");
		}else {
			//구구단 출력
			for(int i=1;i<10;i++)
				System.out.println(num+"*"+i+ "="+num*i);//입력받은 정수가 출력하고자 하는 단이므로 2 대신 num으로 대체
		}
		
//		for(int i = 1;i<10 ;i++)
//		System.out.println("2 * " +i+ "=" +2*i);
//		System.out.println("2 * 1 = 2");
//		System.out.println("2 * 2 = 4");
//		System.out.println("2 * 3 = 6");
//		System.out.println("2 * 4 = 8");
//		System.out.println("2 * 5 = 10");
//		System.out.println("2 * 6 = 12");
//		System.out.println("2 * 7 = 14");
//		System.out.println("2 * 8 = 16");
//		System.out.println("2 * 9 = 18");
	}
}
