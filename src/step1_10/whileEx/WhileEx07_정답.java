package step1_10.whileEx;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down 게임[2단계]
 * 1. 정답을 맞추면 게임은 종료된다.
 * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
 * 3. 게임 종료 후, 점수를 출력한다.
 */

public class WhileEx07_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int random = ran.nextInt(100)+1;
		int run = 1;
		int score = 100;
		int cnt = 0;
		
		System.out.println(random);
		while ( run == 1) {
			System.out.println("숫자입력 : ");
			int myanswer = scan.nextInt();
			
			if(random == myanswer ) {
				System.out.println("게임종료");
				run = 0;
				
			} else  if(random > myanswer) {
				System.out.println("up");
				score = score - 5;
				//System.out.println(score);
			} else if (random < myanswer) {
				System.out.println("down");
				score = score - 5;
				//System.out.println(score);
			}
		
		}
		System.out.println("남은 점수는 : " + score + "입니다");
		
		
	
		
		
	}

}
