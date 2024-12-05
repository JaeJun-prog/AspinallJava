package com.Aspinall.day02.control.condition.exercise;

import java.util.Scanner;

public class Exercise_Switch2 {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("점수를 입력해주세요 : ");
		int score = sc.nextInt();
		if(score < 0 || score > 100) {
			System.out.print("0 ~ 100 사이의 수를 입력해주세요.");
		}else {
			switch(score/10) {
				case  10:
					System.out.println("학점은 A 입니다."); 
					break;
				case  9:
					System.out.println("학점은 A 입니다."); 
					break;
				case  8:
					System.out.println("학점은 B 입니다."); 
					break;
				case  7:
					System.out.println("학점은 C 입니다."); 
					break;
				case  6:
					System.out.println("학점은 D 입니다."); 
					break;
				default: System.out.println("학점은 F 입니다.");
			}
		}
	}
}
