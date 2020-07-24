package step1_05.input;

import java.util.Scanner;
// 7월23일 (16:57~15:07, 10분)
public class InputEx02_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문제 1) 숫자 2개를 입력받아, 합 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int num1 = scan.nextInt();
		
		//추가
		System.out.println("두번째 숫자를 입력하세요");
		int num2 = scan.nextInt();
		System.out.println("입력하신 두 숫자의 합은 " + (num1+num2) + "입니다.");
	
		// 문제 2) 숫자 1개를 입력받아, 홀수이면 true 출력
		System.out.println("숫자를 입력하세요");
		int num3 = scan.nextInt();
		System.out.println(num3%2 == 1);
		
		// 문제3) 성적을 입력받아, 60점 이상이고, 100점 이하이면 true 출력
		System.out.println("국어 점수를 입력하세요");
		int jumsu1 = scan.nextInt();
		System.out.println(jumsu1 >=60 && jumsu1 <=100);
	}

}
