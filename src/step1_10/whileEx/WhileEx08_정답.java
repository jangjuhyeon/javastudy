package step1_10.whileEx;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 */

public class WhileEx08_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int log = -1;
		
		boolean run = true;
		while(run) {
			System.out.println("1.로그인");
			System.out.println("1.로그아웃");
			System.out.println("1.종료");
			
			System.out.println("메뉴선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {}
			else if(sel == 2) {}
			else if(sel == 0) {}
				run = false;
				System.out.println("프로그램 종료");
		}
	}

}
