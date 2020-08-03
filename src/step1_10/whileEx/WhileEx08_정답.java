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
		// -1(로그아웃), 1,(dbAcc1로그인), 2.dbAcc2
		
		boolean run = true;
		while(run) {
			if(log == -1)
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");
			
			System.out.println("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(log == -1) {
					System.out.println("계좌번호 입력 : ");
					int myAcc = scan.nextInt();
					
					System.out.println("비밀번호 입력 : ");
					int myPw = scan.nextInt();
					
					if(myAcc == dbAcc1 && myPw == dbPw1) {
						log = 1;
						System.out.println(dbAcc1 + " 님, 환영합니다.");
					}
					else if(myAcc == dbAcc2 && myPw == dbPw2) {
						log = 2;
						System.out.println(dbAcc2 + " 님, 환영합니다.");
					}
					else {
						System.out.println("계좌번호와 비밀번호를 확인해주세요.");
					}
				} else {
					if(log == 1) {
						System.out.println("현재 : " + dbAcc1 + "님 로그인중..");
					}else if(log ==2) {
						System.out.println("현재" + dbAcc2 + "님, 로그인중..");
					}
				}
			}
			else if(sel == 2) {
				if (log != -1) {
					log = -1;
					System.out.println("로그아웃 되었습니다");
					
				}
				else {
					System.out.println("로그인 후 이용해주세요.");
				}
			}
			else if(sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
			
		}
	}

}