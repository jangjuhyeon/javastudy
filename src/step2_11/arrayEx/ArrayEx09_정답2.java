package step2_11.arrayEx;

import java.util.Scanner;

/*
 * # 영화관 좌석예매
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0 
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */

public class ArrayEx09_정답2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int[] seat = new int[7];
		int price = 0;
		boolean run = true;
		while(run) {
			for(int i =0; i<7; i++) {
				if(seat[i]==0) {
					System.out.print("[ ]");
				}else {
					System.out.print("[O]");
				}
				
			}
			System.out.println();
			System.out.println("=메가 영화관=");
			System.out.println("1.좌석예매");
			System.out.println("2.종료");
		 
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("좌석 선택[0-6] : ");
				int mySeat = scan.nextInt();
				
				if(seat[mySeat] == 0) {
					System.out.println(mySeat + "번 좌석 예약 완료");
					seat[mySeat]=1;
				}else{
					System.out.println("이미 예매가 완료된 자리입니다.");
				}
			}
			else if(sel == 2) {
				for(int i = 0; i<7; i++) {
					if(seat[i]==1) {
						price = price + 1;
					}
				run = false;
			}
			
			
				
			}
			System.out.println("매출액 " + price * 12000 +"원");
			
		}
		
	}
	

}
