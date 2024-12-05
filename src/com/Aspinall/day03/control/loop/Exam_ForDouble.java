package com.Aspinall.day03.control.loop;

import java.util.Scanner;

public class Exam_ForDouble {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 2 ~ 9eks 단 구구단을 출력하시오.
		 */
		for(int i=2; i <10; i++) {
			for(int j=1; j < 10; j++) {
				System.out.println(i + " * "+ j + " = "+i*j);				
			}
		}
		for(int j = 2;j < 10; j++) {
			for(int i = 1; i < 10; i++) {
				System.out.println(j+" * "+i+" = "+j*i);
			}
		}
		
//		for(int i = 1; i < 10; i++) {
//			System.out.println("3 * "+i+" = "+3*i);
//		}
//		for(int i = 1; i < 10; i++) {
//			System.out.println("4 * "+i+" = "+4*i);
//		}
//		for(int i = 1; i < 10; i++) {
//			System.out.println("5 * "+i+" = "+5*i);
//		}
//		for(int i = 1; i < 10; i++) {
//			System.out.println("6 * "+i+" = "+6*i);
//		}
//		for(int i = 1; i < 10; i++) {
//			System.out.println("7 * "+i+" = "+7*i);
//		}
//		for(int i = 1; i < 10; i++) {
//			System.out.println("8 * "+i+" = "+8*i);
//		}
//		for(int i = 1; i < 10; i++) {
//			System.out.println("9 * "+i+" = "+9*i);
//		}
			
//		
//		System.out.println("2 * 2 = 4");
//		System.out.println("2 * 3 = 6");
//		System.out.println("2 * 4 = 8");
//		System.out.println("2 * 5 = 10");
//		System.out.println("2 * 6 = 12");
//		System.out.println("2 * 7 = 14");
//		System.out.println("2 * 8 = 16");
//		System.out.println("2 * 9 = 18");

//		System.out.println("3 * 1 = 3");
//		System.out.println("3 * 2 = 6");
//		System.out.println("3 * 3 = 9");
//		System.out.println("3 * 4 = 12");
//		System.out.println("3 * 5 = 15");
//		System.out.println("3 * 6 = 18");
//		System.out.println("3 * 7 = 21");
//		System.out.println("3 * 8 = 24");
//		System.out.println("3 * 9 = 27");
//		
//		System.out.println("4 * 1 = 4");
//		System.out.println("4 * 2 = 8");
//		System.out.println("4 * 3 = 12");
//		System.out.println("4 * 4 = 16");
//		System.out.println("4 * 5 = 20");
//		System.out.println("4 * 6 = 24");
//		System.out.println("4 * 7 = 28");
//		System.out.println("4 * 8 = 32");
//		System.out.println("4 * 9 = 36");
	}
}
