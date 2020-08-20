package step2_11.arrayEx;

import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 추가
 */

public class ArrayEx19_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 0, 0, 0};
		int cnt = 2;
		
		boolean run = true;
		while(run) {
			for(int i =0; i<cnt; i++) {
				System.out.println(arr[i] +" ");
			}
			System.out.println();
			
			System.out.println("[1]추가");
			
			System.out.println("메뉴 선택 : ");

			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(cnt == 5) {
					System.out.println("더이상 추가할 수 없습니다");
					continue;
				}
				System.out.println("추가할 값 입력 : ");
				int data = scan.nextInt();
				
				arr[cnt] = data;
				cnt += 1;
				
				}
			}
		}
	}


