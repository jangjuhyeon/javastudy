package step1_06.ifEx;

import java.util.Scanner;

import javax.sound.midi.Synthesizer;

/*
 * # 구구단 게임[1단계]
 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
 * 예)	3 x 7 = ?
 * 3. 문제에 해당하는 정답을 입력받는다.
 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
 */
//7월24일 (16:40-16:50
public class IfEx06_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("곱셈식을 만들기위한 숫자 2개를 입력하세요");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int answer = num1 * num2;
		
		System.out.println(num1 + " X " + num2 + " = ?");
		System.out.println("정답을 입력하세요");
		int Myanswer = scan.nextInt();
		
		if((num1*num2) == answer ) {
			System.out.println("정답");
		}
		
		if((num1*num2) != answer) {
			System.out.println("땡");
			
		}
		
		
		
		
	}

}
