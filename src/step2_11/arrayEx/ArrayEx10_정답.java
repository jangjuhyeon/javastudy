package step2_11.arrayEx;

import java.util.Random;
import java.util.Scanner;

/*
 * # 즉석복권
 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
 */

public class ArrayEx10_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int[] lotto = {0, 0, 7, 7, 7, 0, 0, 0};
		//int[] lotto = {7, 0, 7, 7, 0, 0, 0, 0};
		//int[] lotto = {7, 0, 7, 7, 7, 0, 7, 0};
		
		boolean run = true;
		while(run) {			
			System.out.println("1) 복권 결과확인");						
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				for(int i =  0; i < 7-2; i++) {
					if(lotto[i]==7 && lotto[i+1]==7 &&lotto[i+2]==7) {
						System.out.println("당첨");
						//i = 7-2;
					}
				}
		
			}						
		}
		
		


	}

}
