package step1_10.whileEx;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[3단계]
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 */

public class WhileEx04_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int score = 0;
		int cnt = 0;
		
		int i = 1;
		while(i <= 5) {
			int x = ran.nextInt(8) + 2;
			int y = ran.nextInt(9) + 1;
			int answer = x * y;
			
			System.out.println(x + " X " + y + " = " );
			int myAnswer = scan.nextInt();
			if(answer == myAnswer) {
				cnt = cnt + 1;
			}
			i = i + 1; //while문 다시 못들어가게 하려고 쓰는것,
		}
		score = cnt * 20;
		System.out.println("성적 = " + score + "점");
	}
}
