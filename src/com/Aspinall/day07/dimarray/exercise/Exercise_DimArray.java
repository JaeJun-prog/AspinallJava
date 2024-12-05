package com.Aspinall.day07.dimarray.exercise;
//기능용 클래스
public class Exercise_DimArray {
	public void practice1() {
		// 5 4 3 2 1
		// 10 9 8 7 6
		// 15 14 13 12 11
		// 20 19 18 17 16
		// 25 24 23 22 21
		
		int nums[][]=new int[5][5];
		int k=1;
		for(int i=0; i<5; i++) {
			for(int j=4; j>=0; j--) {
				nums[i][j]=k;
				k++;
			}
		}
		for(int i=0; i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				System.out.printf("%2d\t", nums[i][j]);
			}
			System.out.println();
		}
		
//		nums[0][0]=5;
//		nums[0][1]=4;
//		nums[0][2]=3;
//		nums[0][3]=2;
//		nums[0][4]=1;
//		
//		nums[1][0]=10;
//		nums[1][1]=9;
//		nums[1][2]=8;
//		nums[1][3]=7;
//		nums[1][4]=6;
//		
//		nums[2][0]=15;
//		nums[2][1]=14;
//		nums[2][2]=13;
//		nums[2][3]=12;
//		nums[2][4]=11;
//		
//		nums[3][0]=20;
//		nums[3][1]=19;
//		nums[3][2]=18;
//		nums[3][3]=17;
//		nums[3][4]=16;
//		
//		nums[4][0]=25;
//		nums[4][1]=24;
//		nums[4][2]=23;
//		nums[4][3]=22;
//		nums[4][4]=21;
		
	}
	public void practice2() {
		// 5 10 15 20 25
		// 4 9 14 19 24
		// 3 8 13 18 23
		// 2 7 12 17 22
		// 1 6 11 16 21
		//5씩 증가함
		//1씩 감소함
		
		int nums[][]=new int[5][5];
		int k=1;
		for(int i=0; i<5; i++) {
			for(int j=4; j>=0; j--) {
				nums[j][i]=k;
				k++;
			}
		}
		for(int i=0; i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				System.out.printf("%2d\t", nums[i][j]);
			}
			System.out.println();
		
		
//		int nums[][]=new int[5][5];
//		//int k=5;
//		for(int i=0; i<5; i++) {
//			for(int j=0, k=1; j<5; j++, k++) {
//				nums[i][j]=5*k-i;
//			}
//			//k--;
//		}
//		for(int i=0; i<nums.length;i++) {
//			for(int j=0;j<nums[i].length;j++) {
//				System.out.printf("%2d\t", nums[i][j]);
//			}
//			System.out.println();
		}
//		nums[0][0] = 5;
//		nums[0][1] = 10;
//		nums[0][2] = 15;
//		nums[0][3] = 20;
//		nums[0][4] = 25;
//
//		nums[1][0] = 4;
//		nums[1][1] = 9;
//		nums[1][2] = 14;
//		nums[1][3] = 19;
//		nums[1][4] = 24;
//
//		nums[2][0] = 3;
//		nums[2][1] = 8;
//		nums[2][2] = 13;
//		nums[2][3] = 18;
//		nums[2][4] = 23;
//
//		nums[3][0] = 2;
//		nums[3][1] = 7;
//		nums[3][2] = 12;
//		nums[3][3] = 17;
//		nums[3][4] = 22;
//
//		nums[4][0] = 1;
//		nums[4][1] = 6;
//		nums[4][2] = 11;
//		nums[4][3] = 16;
//		nums[4][4] = 21;
		
	}
	public void practice3() {
		// 1 6 11 16 21
		// 2 7 12 17 22
		// 3 8 13 18 23
		// 4 9 14 19 24
		// 5 10 15 20 25
		
		int num[][]=new int[5][5];
		
		
//		num[0][0]=1;
//		num[0][1]=6;
//		num[0][2]=11;
//		num[0][3]=16;
//		num[0][4]=21;
//		
//		num[1][0]=2;
//		num[1][1]=7;
//		num[1][2]=12;
//		num[1][3]=17;
//		num[1][4]=22;
		
		
	}
	public void practice4() {
		// 1 2 3 4 5
		// 10 9 8 7 6
		// 11 12 13 14 15
		// 20 19 18 17 16
		// 21 22 23 24 25
		//if 사용해야함
		int nums[][]=new int [5][5];
		int k= 1;
		
		for(int i = 0; i < nums.length; i++) {
			if(i%2==0) {//짝수일때
				for(int j = 0; j < nums[i].length; j++) {
					nums[i][j]=k;
					k++;
				}
			}else {//홀수일때
				for(int j = 4; j >=0; j--) {
					nums[i][j]=k;
					k++;
				}
			}
		}
		
		nums[0][0]=1;
		nums[0][1]=2;
		nums[0][2]=3;
		nums[0][3]=4;
		nums[0][4]=5;
		
		nums[1][0] = 10;
		nums[1][1] = 9;
		nums[1][2] = 8;
		nums[1][3] = 7;
		nums[1][4] = 6;

		nums[2][0] = 11;
		nums[2][1] = 12;
		nums[2][2] = 13;
		nums[2][3] = 14;
		nums[2][4] = 15;

		nums[3][0] = 20;
		nums[3][1] = 19;
		nums[3][2] = 18;
		nums[3][3] = 17;
		nums[3][4] = 16;

		nums[4][0] = 21;
		nums[4][1] = 22;
		nums[4][2] = 23;
		nums[4][3] = 24;
		nums[4][4] = 25;
		
		for(int i=0; i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				System.out.printf("%2d\t", nums[i][j]);
			}
			System.out.println();
		}
	}
}
