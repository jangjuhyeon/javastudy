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

public class ArrayEx09_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int[] seat = new int[7];
		
		boolean run = true;
		while(run) {
			for(int i =0; i<7; i++) {
				if(seat[i]==0) {
					System.out.println("[ ]");
				}else {
					System.out.println("[O]");
				}
			}
			
			
			System.out.println("=메가 영화관=");
			System.out.println("1.좌석예매");
			System.out.println("2.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			int check = 0;//빈자리
			if(sel == 1) {
				System.out.println("좌석을 선택[0-6] : ");
				int myChoice = scan.nextInt();
				if(seat[1] == 0) {
					if(myChoice == 1) {
						System.out.println("1번자리 선택");
						seat[1] = 1;
					}else if(seat[0]==0) {
						if(myChoice==2) {
							System.out.println("0번자리 선택");
							seat[0] = 1;
						}else if(seat[2]==0) {
							System.out.println("2번자리 선택");
							seat[2]= 1;
						}
					}
				}
				
			}
			else if(sel == 2) {
				run = false;
			}
		}

	}

}
