package step1_10.whileEx;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 1. 입금
 * . 입금할 금액을 입력받아, myMoney에 입금
 * 2. 출금
 * . 출금할 금액을 입력받아, myMoney에서 출금
 * . 단, 출금할 금액이 myMoney 잔액을 초과할 경우 출금불가
 * 3. 이체
 * . yourAcc 계좌번호를 입력받아, 이체
 * . 이체할 금액이 myMoney 잔액을 초과할 경우 이체 불가
 * . 이체 후 yourMoney 잔액 증가
 * 4. 조회
 * . myMoney와 yourMoney 잔액 모두 출력
 */

public class WhileEx09_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner scan = new Scanner(System.in);
			int myAcc = 111;
			int myMoney = 50000;
			
			int yourAcc = 222;
			int yourMoney = 70000;
			
			int myDeposit = 0;
			int myWithdraw = 0;
			int yourAccTrans = 0;
			
			boolean run = true;
			
			while(run) {
				System.out.println("1.입금");
				System.out.println("2.출금");
				System.out.println("3.이체");
				System.out.println("4.조회");
				System.out.println("0.종료");
				
				System.out.println("메뉴 선택 : ");
				int sel = scan.nextInt();
				
				if(sel == 1) {
					System.out.println("입금 할 금액을 입력하세요 : ");
					myDeposit = scan.nextInt();
					myMoney = myDeposit + myMoney;
					System.out.println("입금이 완료되었습니다.");
					
				}
				else if(sel == 2) {
					System.out.println("출금 할 금액을 입력하세요");
					myWithdraw = scan.nextInt();
					myMoney = myMoney - myWithdraw;
					if(myMoney < myWithdraw) {
						System.out.println("잔액이 부족하여 출금불가합니다.");
					} else {
						System.out.println("나의계좌에서 " + myWithdraw +"원 출금완료되었습니다.");
					}
					
				}
				else if(sel == 3) {
					System.out.println("이체하실 계좌를 입력해주세요");
					int yourAccbank = scan.nextInt();
					
					if(yourAccbank == yourAcc) {
						System.out.println("이체하실 금액을 입력주세요 : ");
						yourAccTrans = scan.nextInt();
						if(yourAccTrans > myMoney) {
							System.out.println("잔액이 부족합니다.");
						} else {
							System.out.println("나의 계좌에서 " + yourAccTrans+"원 이 " + yourAcc + "님에게 이체되었습니다.");
						}
					}
					else {
						System.out.println("");
					}
				}
				else if(sel == 4) {
					System.out.println("조회하실 계좌번호를 입력해주세요");
					int lookUp = scan.nextInt();
					yourMoney = yourMoney + yourAccTrans;
					if(lookUp == myAcc) {
						System.out.println(myAcc+"님 계좌에는 현재" + myMoney + "원이 있습니다.");
					}else if(lookUp == yourAcc) {
						System.out.println(yourAcc + "님 계좌에는 현재" + yourMoney + "원이 있습니다.");
					}
				}
				else if(sel == 0) {
					run = false;
					System.out.println("프로그램 종료");
				}
				
			}
	}

}
