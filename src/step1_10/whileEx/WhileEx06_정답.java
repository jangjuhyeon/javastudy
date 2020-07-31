package step1_10.whileEx;

import java.util.Scanner;

/*
 * # 반복문 종료(-100)
 * 1. 무한 반복을 하면서 숫자를 입력받는다.
 * 2. 입력한 숫자가 -100이면, 프로그램은 종료된다.
 * 예)
 * 숫자 입력[EXIT:-100] : 1
 * 숫자 입력[EXIT:-100] : 3
 * 숫자 입력[EXIT:-100] : 4
 * 숫자 입력[EXIT:-100] : -100
 * 프로그램 종료
 */

public class WhileEx06_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int run = 1;
		while(run==1) {
			System.out.println("숫자 입력[EXIT : -100] : ");
			int num = scan.nextInt();
			
			if(num == -100) {
				System.out.println("프로그램 종료");
				run = 0;
			}
		}
	}

}
