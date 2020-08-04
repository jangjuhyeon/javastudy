package step1_10.whileEx;

import java.util.Scanner;

/*
 * # 쇼핑몰 뒤로가기
 * 1. 남성의류
 * 		1) 티셔츠
 * 		2) 바지
 * 		3) 뒤로가기
 * 2. 여성의류
 * 		1) 가디건
 * 		2) 치마
 * 		3) 뒤로가기
 * 3. 종료
 */

public class WhileEx16_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		while(run) {
			System.out.println("1.남성의류");
			System.out.println("2.여성의류");
			System.out.println("3.종료");
			
			System.out.println("메뉴선택");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("1)티셔츠");
				System.out.println("2)바지");
				System.out.println("3)뒤로가기");
			}
			
			else if(sel == 2) {
				
			}
			else if(sel == 3) {
				run = false;
				System.out.println("프로그램종료");
			}
		}
	}

}
