package step1_06.ifEx;

import java.util.Scanner;

/*
 * # 영수증 출력[1단계]
 * 1. 메뉴판을 출력한다.
 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
 * 3. 현금을 입력받는다.
 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
 */

// 7,27(16:01-
public class IfEx11_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거: " + price1 + "원");
		System.out.println("2.새우 버거 : " + price2 + "원");
		System.out.println("3.콜라 : " + price3 + "원");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴의 번호를 입력해주세요");
		int num = scan.nextInt();
		System.out.println("현금을 입력해주세요");
		int money = scan.nextInt();

		if(num == 1) {
			if(money >= price1) {
				int changes1 = money - price1;
				System.out.println("잔돈은 " + changes1 + " 입니다.");
			}
			if(money < price1) {
				System.out.println("현금이 부족합니다.");
			}
		}
		
		if(num == 2) {
			if(money >= price2) {
				int change2 = money - price2;
				System.out.println("잔돈은 " + change2 + " 입니다.");
			}
			if(money < price2) {
				System.out.println("현금이 부족합니다.");
			}
		}
		
		if(num == 3) {
			if(money >= price3) {
				int change3 = money - price3;
				System.out.println("잔돈은 " + change3 + " 입니다.");
			}
			if(money < price3) {
				System.out.println("현금이 부족합니다.");
			}
		}
			
		
		
		
	}

}
