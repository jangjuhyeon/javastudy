package step2_11.arrayEx;

import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 삭제
 */

public class ArrayEx20_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10,20,30,40,50};
		int cnt = 5;
		
		boolean isRun = true;
		
		while(isRun) {
			for(int i = 0; i<5; i++) {
				System.out.println(arr[i]+ " ");
			}
			System.out.println();
			
			System.out.println("[2]삭제");
			
			System.out.println("메뉴선택 : ");
			int sel = scan.nextInt();
			
			
			int delIdx = -1;;

			if(sel ==2) {
				System.out.println("삭제할 값 입력 : ");
				int data = scan.nextInt();
				
				for(int i=0; i<cnt; i++) {
					delIdx = i;
				}
			}
			
			if(delIdx == -1) {
				System.out.println("입력하신 값은 존재하지 않습니다.");
			}
		}
	}

}
