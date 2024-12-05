package com.Aspinall.day03.control.loop.exercise;

public class Exercise_ForDouble1 {
	public static void main(String [] args) {
		/*
		 * 0시 0분 부터 23시 59분까지 출력한느 프로그램을 작성하세요
		 * 0시 0분
		 * 0시 1분
		 * 0시 2분
		 * ...
		 * 0시 59분
		 * 1시 0분
		 * ...
		 * 23시 59분
		 */
		for(int i=0;i<24;i++) {
			for(int j=0; j<60; j++) {
				System.out.println( i+" 시 "+j+ " 분 " );
			}
		}
	}
}
