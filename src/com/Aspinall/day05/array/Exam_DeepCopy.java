package com.Aspinall.day05.array;

public class Exam_DeepCopy {
	public static void main(String[]args) {
		int origins [] = {24,11,18,25,5,2};
		//깊은 복사하는 코드
		int copied [] = new int[6];
		for(int i=0; i < copied.length; i++) {
			copied[i] = origins[i];
		}
		copied[0] = 25;
		origins[3] = 26;
		for(int i = 0; i < copied.length; i++)
			System.out.print(copied[i] + " ");
		System.out.println();
		for(int i = 0; i < origins.length; i++)
			System.out.print(origins[i] + " ");
	}
}
