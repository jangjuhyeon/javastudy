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
			
		//System.out.println("myMoney = " + myMoney + "원");
		//System.out.println("yourMoney = " + yourMoney + "원");
			
		System.out.println("이체할 계좌번호를 입력해주세요");
		int transAcc = scan.nextInt();
		
		if(yourAcc == transAcc) {
			System.out.println("이체할 금액을 입력해주세요");
			int transMoney = scan.nextInt();
			
			if(transMoney <= myMoney) {
				myMoney = myMoney - transMoney;
				yourMoney = yourMoney + transMoney;
				System.out.println(transMoney + "원 이체 후 나의 계좌에는"+ myMoney + 
						"가 남습니다. 이체를 완료하였습니다."  );
			} else if(transMoney > myMoney){
				System.out.println("이체 불가");
				
			} else {
				System.out.println("계좌번호를 확인해주세요");
			}
			System.out.println("이체 후 통장잔고 : " + myMoney );
			System.out.println("이체 받은 후 통장잔고 : " + yourMoney);
		}
		
		System.out.println("이체 후 통장잔고 : " + myMoney );
		System.out.println("이체 받은 후 통장잔고 : " + yourMoney);
	
	}

}
