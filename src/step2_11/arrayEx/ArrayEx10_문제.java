package step2_11.arrayEx;

import java.util.Random;
import java.util.Scanner;

/*
 * # 즉석복권
 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
 */

import java.util.Scanner;

/*
 * # 즉석복권
 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
 */

public class ArrayEx10_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int[] lotto = {0, 0, 7, 7, 7, 0, 0, 0};
		//int[] lotto = {7, 0, 7, 7, 0, 0, 0, 0};
		//int[] lotto = {7, 0, 7, 7, 7, 0, 7, 0};
		
		boolean run = true;
		while(run) {
			for(int i =0; i<7; i++) {
				if(lotto[i]==0) {
					System.out.print("[ ]");
				}else {
					System.out.print("[O]");
				}
			System.out.println("1) 복권 결과확인");						
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				int random = ran.nextInt(8);
				
		
				}						
			}
		}
		int[] lotto1 = {0, 0, 7, 7, 7, 0, 0, 0};
		//int[] lotto = {7, 0, 7, 7, 0, 0, 0, 0};
		//int[] lotto = {7, 0, 7, 7, 7, 0, 7, 0};
		
		boolean run1 = true;
		while(run1) {			
			System.out.println("1) 복권 결과확인");						
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
		
			}						
		}


	}
}
