package com.Aspinall.day01.operator;

public class Exam_Unary {
	public static void main(String[]args) {
		/*
		 * 단항연산자
		 * a++, ++a -> a = a + 1;
		 */
		int a = 10;
		a++;
		//int num = 1;
		//System.out.println(++num); // num은 2가 됨
		//System.out.println(++num); // +1 연산을 나중에 함. num은 여전히 2가 됨
		//System.out.println(num); //여기서 num은 3이 됨
		//++num, num++, num -> 2, 2, 3
		//num++, ++num, num -> 1, 3, 3
		//num++, num++, num -> 1, 2, 3
		//++num, ++num, num -> 2, 3, 3
		
		/*
		 * 문제1
		 * a가 10, b는 20, c는 30 입니다.
		 * a++;
		 * 11,20,30
		 * b = (--a) + b;
		 * 10,30,30
		 * c = (a++) + (--b);
		 * 11,29,39 
		 * 연산을 끝마친 후
		 * a, b, c의 값은 얼마일까요
		 *11,29,39
		 */
		int aNum = 10;
		int bNum = 20;
		int cNum = 30;
		aNum++;
		bNum = (--aNum) + bNum;
		cNum = (aNum++) + (--bNum);
		System.out.printf("a의 값 : %d, b의 값 : %d, c의 값 : %d", aNum, bNum, cNum);
		
		/*
		 * 문제2
		 * x는 100, y는 33, z는 0 입니다.
		 * x--;
		 * 115
		 * z= x-- + --y;
		 * 99,32,131
		 * x= 98 + x++ + x;
		 * 296,32,131
		 * y= y-- + y + ++y;
		 * 296,95,131
		 * 의 연산을 끝마친 후
		 * x, y, z의 값은 얼마일까요?
		 * -> x = 296, y = 95, z = 131
		 * 
		 *  
		 *  
		 */
		int x = 100;
		int y = 33;
		int z = 0;
		x--;
		z = x-- + --y;
		x = 99 + x++ + x;
		y = y-- + y + ++y;
		System.out.println(" x의 값 : "+x+", y의 값 : " +y+", z의 값 : "+z);
		/*
		 * 문제3
		 * a는 5, b는 10입니다.
		 * c = (++a) + b;
		 * d = c / a;
		 * e = c % a;
		 * f = e++;
		 * g = (--b) + (d--);
		 * h = 2;
		 * i = a++ + b / (--c / f) * (g-- - d) % (++e + h);
		 * a: ?, b: ?, c: ?, d: ?, e: ?, f: ?, g: ?, h: ?, i: ?의 값은 무엇일까요?
		 * 7, 9, 15, 1, 6, 4, 10, 2, 12
		 */
		
	}
}
