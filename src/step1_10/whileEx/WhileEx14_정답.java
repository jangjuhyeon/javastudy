package step1_10.whileEx;

import java.util.Scanner;

public class WhileEx14_정답 {
	
	/*
	 * # 최대값 구하기[2단계]
	 * 1. 3회 반복을 하면서 정수를 입력받는다.
	 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int maxNum = 0;
		
		int i = 1;
		while(i <= 3) {
			System.out.println("정수 입력 : " );
			int num = scan.nextInt();
			
			if(maxNum<num) {
				maxNum = num;
			}
			i += 1;
		}
		
		System.out.println("최대값 = " + maxNum);
	}

}
