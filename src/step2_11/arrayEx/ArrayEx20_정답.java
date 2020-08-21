package step2_11.arrayEx;

import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 삭제
 */
public class ArrayEx20_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 40, 50};
		int cnt = 5;
		
		boolean run = true;
		while(run) {
			
			System.out.println("[2]삭제");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 2) {
				
				System.out.print("삭제할 값 입력 : ");
				int data = scan.nextInt();
				
				int delIdx = -1;
				for(int i = 0 ;i <cnt; i++) {
					if(arr[i] == data) {
						delIdx = i;
					}
				}
				
				if(delIdx == -1) {
					System.out.println("입력하신 값은 존재하지않습니다.");
					
				} else {
					int temp[] = new int[5];
					int tempIdx = 0;
					
					for(int i = 0; i<cnt; i++) {
						if(i != delIdx) {
							temp[tempIdx] = arr[i];
							tempIdx +=1;
						}
					}
					for(int i = 0; i<cnt; i++) {
						arr[i]= temp[i];
					}
					cnt -= 1;
				}
				
			}
			
		}
	
	}

}
