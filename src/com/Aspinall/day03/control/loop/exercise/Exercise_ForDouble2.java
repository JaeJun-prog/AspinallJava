package com.Aspinall.day03.control.loop.exercise;

public class Exercise_ForDouble2 {
	public static void main(String [] args) {
		// *
		// **
		// ***
		// ****
		// *****
		// ******
		for(int j = 1; j < 7; j++) {
			for(int i=0; i<j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
