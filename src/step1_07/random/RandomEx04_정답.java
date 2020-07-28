package step1_07.random;

import java.util.Random;
import java.util.Scanner;

/*
 * # 홀짝 게임
 * 1. 1~100사이의 랜덤 숫자를 저장한다.
 * 2. 저장된 랜덤 숫자를 보여주고,
 * 3. 해당 숫자가 홀수인지 짝수인지 맞추는 게임이다.
 */

public class RandomEx04_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int random = ran.nextInt(100) + 1;
		
		System.out.println("문제 [ " + random + " ]");
		System.out.println("1.홀수");
		System.out.println("2.짝수");
		
		System.out.println("번호를 선택하세요 : ");
		int choice = scan.nextInt();
		
		if(choice == 1) {
			if(random % 2 == 1) {
				System.out.println("정답");
			}
			
			if(random % 2 == 0) {
				System.out.println("오답");
			}
			
		}
		
		if(choice == 2) {
			if(random % 2 == 0) {
				System.out.println("정답");
			}
			
			if(random % 2 == 1 ) {
				System.out.println("오답");
			}
		
	}

}
}
