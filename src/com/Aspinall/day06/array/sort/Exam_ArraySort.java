package com.Aspinall.day06.array.sort;

public class Exam_ArraySort {
	public static void maun(String [] args) {
		int [] arrs = {1, 3, 2};
		for(int val: arrs)
			System.out.println(val);
		int temp=arrs[2];
		arrs[2]=arrs[1];
		arrs[1]=temp;
		for(int num:arrs) {
			System.out.println(num+" ");	
		}
	}
}
