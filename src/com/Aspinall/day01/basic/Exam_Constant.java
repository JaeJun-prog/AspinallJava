package com.Aspinall.day01.basic;

public class Exam_Constant {


public static void main(String [] args) {
	//원의 면적을 구하는 프로그램을 작성해보자.
	//원의 면적=반지름 * 반지름 * PI
	final double PI = 3.14;
	//PI =3.24; //재할당 불가능 -> 상수(final)
	
	double radius = 10.2;
	radius = 5.2;
	double circleArea = radius * radius * PI;
	System.out.println("원의 면적 : " + circleArea);
	}
}