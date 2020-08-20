package step2_11.arrayEx;

import java.util.Scanner;

/*
 * # 값 교체하기[2단계] 
 */

public class ArrayEx12_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 40, 50};
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예    1) 인덱스1 입력 : 1
		//		   인덱스2 입력 : 3
		//		  {10, 40, 30, 20, 50}
		System.out.println(">>>문제1");
		System.out.println("인덱스  1 입력 : ");
		int idx1 = scan.nextInt();
		System.out.println("인덱스 2입력 : ");
		int idx2 = scan.nextInt();
		
		int index = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = index;
		
		for(int i = 0; i<5; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
		
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예    2) 값1 입력 : 40
		//        값2 입력 : 20
		//		  {10, 20, 30, 40, 50}
		
		System.out.println(">>>문제2");
		System.out.print("값1 입력 : ");
		int data1 = scan.nextInt();
		System.out.print("값2 입력 : ");
		int data2 = scan.nextInt();
		
		idx1 = 0;
		idx2 = 0;
		
		for(int i=0; i<5; i++) {
			if(arr[i] == data1) {
				idx1 = i;
			}
			if(arr[i] == data2) {
				idx2 = i;
			}
		}
		index = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = index;
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예    3) 학번1 입력 : 1002
		//        학번2 입력 : 1003
		//		 {87, 45, 11, 98, 23}
		idx1 = 0;
		idx2 = 0;
		System.out.println("학번 1 입력 : ");
		int hakbun1 = scan.nextInt();
		System.out.println("학번 2 입력 : ");
		int hakbun2 = scan.nextInt();
		
		for(int i = 0; i<5; i++) {
			if(hakbun1 == hakbuns[i]) {
				idx1 = i;
			}
			if(hakbun2 == hakbuns[i]) {
				idx2 = i;
			}
		}
		
		index = scores[idx1];
		scores[idx1] = scores[idx2];
		scores[idx2] = index;
		for(int i = 0; i<5; i++) {
			System.out.println(scores[i]);
		}
		 
			 


	}

}
