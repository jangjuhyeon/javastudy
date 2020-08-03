package step1_10.whileEx;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 * 3. 입금
 * . 로그인 후 이용가능
 * 4. 출금
 * . 로그인 후 이용가능
 * 5. 이체
 * . 로그인 후 이용가능
 * 6. 조회
 * . 로그인 후 이용가능
 * 7. 종료
 */

public class WhileEx10_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;
		
		int log = -1;
		//-1(로그아웃), 1(dbAcc1로그인), 2(dbAcc로그인)
		
		boolean run = true;
		while(run) {
			
			System.out.println("dbMoney1 = " + dbMoney1 + "원");
			System.out.println("dbMoney2 = " + dbMoney2 + "원");
			System.out.println("*상태 : ");
			
			if(log == -1) {
				System.out.println("로그아웃");
			}else if(log == 1) {
				System.out.println(dbAcc1 + "로그인");
			}else if(log ==2) {
				System.out.println(dbAcc2 + "로그인");
			}
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");
			
			System.out.println("메뉴선택 : ");
			
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(log == -1) {
					System.out.println("계좌번호를 입력하세요");
					int acc = scan.nextInt();
					System.out.println("비밀번호를 입력하세요");
					int accPw = scan.nextInt();
					if(dbAcc1 == acc && dbPw1 == accPw ) {
						log = 1;
						System.out.println(dbAcc1+ "님 로그인 되었습니다.");
					}else if(dbAcc2 == acc && dbPw2 == accPw) {
						log = 2;
						System.out.println(dbAcc2 + "님 로그인 되었습니다.");
					} else {
						System.out.println("계좌번호와 비밀번호를 확인해주세요");
					}
				}
				else {
					System.out.println("이미 로그인 중 입니다.");
				}
			}
			else if(sel == 2) {
				if(log != -1) {
					log = -1;
					System.out.println("로그아웃 되었습니다.");
				} else {
					System.out.println("로그인 후 이용가능합니다.");
				}
			}
			else if(sel == 3) {
				if(log != -1) {
					System.out.println("입금할 금액 입력 : ");
					int money = scan.nextInt();
					if(log == 1 ) {
						dbMoney1 = dbMoney1 + money;
						
					}
					else if(log == 2) {
						dbMoney2 = dbMoney2 + money;
					}
					System.out.println("입금을 완료하였습니다.");
					
				}
			}
			else if(sel == 4) {
				System.out.println("계좌번호를 입력하세요 : ");
				int acc = scan.nextInt();
				System.out.println("비밀번호를 입력해주세요");
				int accPw = scan.nextInt();
				if(acc == dbAcc1 && accPw==dbPw1) {
					System.out.println("출금할 금액을 입력해주세요");
					int money = scan.nextInt();
					if(dbMoney1 >= money) {
						dbMoney1 = dbMoney1 - money;
						System.out.println("출금이 완료되었습니다.");
					}else if(dbMoney2 >= money) {
						dbMoney2 = dbMoney2 - money;
					}else {
						System.out.println("계좌번호와 비밀번호를 확인해주세요.");
					}
					
					
				}
			}
			else if(sel == 5) {
				
			}
			else if(sel == 6) {}
			else if(sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
	}

}
