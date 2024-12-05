package com.Aspinall.day01.operator;

import java.util.Scanner;

public class Exam_Arithmetic {
	public static void main(String [] args) {
		//초 단위의 정수를 입력받고, 몇 시간, 몇 분, 몇 초인지
		//출력하는 프로그램을 작성하여라
		//초단위의정수 입력 : 3000
		//0시간 50분 0초 입니다.
		//초단위의 정수 입력 : 3287
		//0시간 54분 47초입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("초 단위의 정수 입력 : ");
		int time = sc.nextInt();
		int hour = time / 60 / 60;
		int minute = time / 60 %60;
		int second = time % 60;
		
		System.out.println(hour+"시간"+minute + "분" + second +"초입니다.");
		
		
		
	}
}
