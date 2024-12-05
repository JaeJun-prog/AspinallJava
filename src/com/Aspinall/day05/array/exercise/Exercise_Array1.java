package com.Aspinall.day05.array.exercise;

import java.util.Scanner;

public class Exercise_Array1 {
	public static void main(String[]args) {
		/*
		 * 배열의 length 필드를 이용하여 배열 크기만큼 정수를
		 * 입력받고 평균을 구하는 프로그램을 작성하라.
		 * 단, 배열의 크기는 5이다.	
		 */
		Scanner sc = new Scanner(System.in);
		int [] nums= new int[5];
		int i =0;
		int total = 0;
		for(i=0;i< nums.length;i++) {
			nums[i]= sc.nextInt();
			total += nums[i];
		}
		double avg = total/(double)5;
		System.out.println("평균 : " + avg);
		
	}
}
