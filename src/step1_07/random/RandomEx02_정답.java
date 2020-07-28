package step1_07.random;

import java.util.Random;
import java.util.Scanner;

public class RandomEx02_정답 {

	/*
	 * # 코인 게임
	 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
	 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
	 * 3. 동전의 앞뒷면을 맞추는 게임이다.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in );
		
		// 예) 0 ~ 2 사이의 랜덤 int rNum = ran.nextInt(3);
		int coin = ran.nextInt(2); //0.1
		
		if(coin == 0) {
			System.out.println("치트키 = 앞면");
		}
		if(coin == 1) {
			System.out.println("치트키 = 뒷면");
		}
		
		System.out.println("동전의 앞면(=0), 동전의 뒷면(=1) 숫자를 입력해주세요");
		int num = scan.nextInt();
		if(coin == num) {
			System.out.println("정답!");
			
		}
		if(coin != num) {
			System.out.println("땡!");
			
		}
	
		
	}

}
