package step1_08.ifEx;

import java.util.Random;
import java.util.Scanner;

/*
 * # 연산자 기호 맞추기 게임
 * 1. 1~10 사이의 랜덤 숫자 2개를 저장한다.
 * 2. 1~4 사이의 랜덤 숫자 1개를 저장한다.
 * 3. 위 숫자는 연산자 기호에 해당된다.
 * 	  1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지
 * 4. 사용자는 연산자 기호를 맞추는 게임이다.
 * 예) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    정답 : 2번
 */

public class IfEx19_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random(); 
		Scanner scan = new Scanner(System.in);
		
		int rNum1 = ran.nextInt(10) + 1;
		int rNum2 = ran.nextInt(10) + 1;
		
		//연산자
		
		int answer = ran.nextInt(4) + 1;
		if(answer == 1) {
			answer = rNum1 + rNum2;
		}else if(answer == 2) {
			answer = rNum1 - rNum2;
		}else if(answer == 3) {
			answer = rNum1 * rNum2;
		}else {
			answer = rNum1 / rNum2;
		}
		System.out.println(rNum1 + "?" + rNum2 + " = " + answer );
		
		
		System.out.println("연산자 기호 1)덧셈 2)뺄셈 3)곱셈 4)나머지");
		System.out.println("==============================");
		System.out.println(rNum1 + "?" + rNum2 + " = " + answer );
		System.out.println("? 안에 들어갈 연산자 기호를 선택해주세요 : ");
		int mychoice = scan.nextInt();
		
		if(answer == mychoice) {
			System.out.println(answer);
			System.out.println("정답입니다.");
		}else {
			System.out.println("오답입니다.");
		}

		
		
		
		
	}

}
