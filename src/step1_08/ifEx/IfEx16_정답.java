package step1_08.ifEx;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가운데 숫자 맞추기 게임
 * 1. 150~250 사이의 랜덤 숫자 저장
 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
 * 예)
 * 		249		: 4
 */

public class IfEx16_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int random = ran.nextInt(101) + 150; //[0-100] +150 
		
		// 예) 0 ~ 2 사이의 랜덤
		// int rNum = ran.nextInt(3);
		System.out.println("[150- 250]사이의 랜덤숫자 사이의 가운데 숫자를 맞춰주세요!");
		System.out.println("입력 : ");
		int input = scan.nextInt();
		
		int answer = random%100/10;
		System.out.println("[150-250]사이의 랜덤숫자는 " + random + "입니다.");
		if(input == answer) {
			System.out.println("정답입니다.");
		}else {
			System.out.println("오답입니다.");
		}
		
		
	}

}
