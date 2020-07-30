package step1_08.ifEx;

import java.util.Scanner;

/*
 * # ATM[1단계] : 이체하기
 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney	: 이체가능
 * 			myMoney   - 이체할 금액
 * 			yourMoney + 이체할 금액
 *    이체할 금액  > myMoney 	: 이체불가
 */

public class IfEx15_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1234;
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.println("myMoney =" + myMoney + "원" );
		System.out.println("yourMoney = " + yourMoney + "원");
		
		System.out.println("이체할 계좌번호를 입력해주세요");
		int account = scan.nextInt();
		
		if(account == yourAcc) {
			System.out.println("이체 할 금액을 입력해주세요");
			int emoney = scan.nextInt();
			
			if(myMoney>= emoney) {
				int jango = myMoney-emoney;
				System.out.println("현재 나의 통장에는 " + myMoney +
						"원 이있고, " + emoney + "원 을 이체 한 후 나의 통장에는 " + 
						jango + "가 남습니다.");
				
			if(myMoney < emoney) {
				System.out.println("이체불가");
			}
				
			}
		}
		

	}

}
