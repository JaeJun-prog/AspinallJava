package com.Aspinall.day01.inputsc;

import java.io.IOException;
import java.util.Scanner;

public class Exam_ScannerTest {
	public static void main(String [] args) throws IOException {
		System.out.print("반지름 입력 : ");
		//int input = System.in.read();
		//System.out.println("출력 : " + (input-48));
		Scanner sc = new Scanner(System.in);         //무조건 작성
		                                             //정수 입력 nextInt
													//실수 입력 nextDouble
													//문자열 입력 next
		//int input = sc.nextInt();
		double radius = sc.nextDouble();
		//System.out.println("입력 받은 값 :" + input);
		final double PI = 3.14;
		
		double circleArea = radius * radius * PI;
		System.out.println("원의 면적 : " + circleArea);
	}
}
