package step1_06.ifEx;

/*
 * # 제어문(Control Statement)
 * 1. 조건문 : if, switch-case
 * 2. 반복문 : for, while, do-while
 * 3. 보조 제어문 : break, continue
 * 
 * # 조건문 if
 * if(조건식){
 * 		조건식이 참(true)일 때 실행할 문장;
 * }
 */
// 7월23일 (17:16~
public class IfEx01_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(true) {
			System.out.println("실행 O");
		}
		
		if(false) {
			System.out.println("실행 X");
		}
		
		// 예) 홀짝
		int num = 8;
		System.out.println(num % 2 == 0);
		System.out.println(num % 2 == 1);
		
		if(num % 2 == 0) {
			System.out.println("짝수");
		}
		if(num % 2 == 1) {
			System.out.println("홀수");
		}
		
		
		//문제 1) 양수, 0, 음수 출력
		num = -10;
		
		System.out.println(num);
		
		if(num >= 1) {
			System.out.println("양수");
		}
		
		if(num == 0) { 
			System.out.println("0");
		}
		
		if(num <= 0) {
			System.out.println("음수");
		}
		
		//문제 2) 4의 배수 출력
		num = 12;
		if(num%4==0) {
			System.out.println("4의배수가 맞아");
		}
		
		if(num%4==1) {
			System.out.println("4의배수가 아니야");
		}
		
		//문제 3) 합격, 불합격 출력
		int score = 87;
		
		if(score>=80) {
			System.out.println("합격");
		}
		
		if(score<80) {
			System.out.println("불합격");
		}
	}

}
