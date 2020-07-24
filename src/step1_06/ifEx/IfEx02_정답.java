package step1_06.ifEx;

import java.util.Scanner;

/*
 * # Up & Down 게임[1단계]
 * 1. com은 8이다.
 * 2. me는 com의 숫자를 맞추는 게임이다.
 * 3. 다음과 같은 메세지를 출력한다.
 * 1) me < com	: Up!
 * 2) me == com : Bingo!
 * 3) me > com  : Down!
 */
// 7월23일 (17:38~
public class IfEx02_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int com = 8;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int me = scan.nextInt();
		
		
		if(me < com) {
			System.out.println("up");
		}
		
		if(me == com) {
			System.out.println("Bingo!");	
		}
		
		if(me > com) {
			System.out.println("Down!");
		}
	}

}
