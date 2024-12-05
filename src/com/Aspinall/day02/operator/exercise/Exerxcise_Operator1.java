package com.Aspinall.day02.operator.exercise;

import java.util.Scanner;

public class Exerxcise_Operator1 {
	/*
	 * 입력한 정수가 1 ~ 100 사이의 숫자인지 확인하는
	 * 프로그램을 작성하여라
	 * 정수 하나 입력 : 44
	 * 1부터 100사이의 숫자인가? true
	 * 
	 * 정수 하나 입력 : 101
	 * 1부터 100사이의 숫자인가? : false
	 */
	public static void main(String [] args) {
		Scanner sc =new Scanner(System.in);
//		boolean result;
//		int num1 = 101;
//		result = (1 < num1);
//		result = (num1 < 100);
		System.out.print("정수 하나 입력 : " );
		int num = sc.nextInt();
		boolean result = (num < 100 && num > 1);
		System.out.println("1부터 100사이의 숫자인가? : " + result);
			
	}
}
