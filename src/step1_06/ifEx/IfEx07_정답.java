package step1_06.ifEx;

import java.util.Scanner;

/*
 * # 성적 유효성 검사
 * 1. 성적을 입력받는다.
 * 2. 성적이 60점 이상이면 합격, 60점 미만이면 불합격이다.
 * 3. 단, 입력받은 성적이
 *    음수이거나 100점을 초과하면, 예외 메세지를 출력한다.
 *    예) 성적을 잘못 입력했습니다.
 */

//7.24(16:59~
public class IfEx07_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("영어 점수(0~100)를 입력하세요");
		int eng = scan.nextInt();
		if(eng<=100 && eng>=60) {
			System.out.println("합격");
		}
		if(eng<60 && eng>=0) {
			System.out.println("불합격");
		}
		if(eng>100 || eng < 0) {
			System.out.println("성적을 잘못 입력했습니다.");
		}
		
		
	}

}
