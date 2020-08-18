package step2_11.arrayEx;

import java.util.Scanner;

/*
 * # 숫자이동[1단계]
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 */

public class ArrayEx14_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	
		int[] game = { 0, 0, 2, 0, 0, 0, 0 };

		int player = 0;
		for (int i = 0; i < 7; i++) {
			if (game[i] == 2) {
				player = i; //player=2
			}
		 }
		boolean run = true;
		while(run) {
			for(int i = 0; i<7; i++) {
				if(game[i]==2) {
					System.out.print("g ");
				}else {
					System.out.print(game[i] + " ");
				}
			}
			System.out.println();
			
			System.out.println("왼쪽[1] 오른쪽[2] 입력 : ");
			int  move = scan.nextInt();
			// int[] game = { 0, 0, 2, 0, 0, 0, 0 };
			if(move == 1) {
				if(player - 1 >= 0) {
					game[player - 1] = 2; 
					game[player] = 0;
					player -=1; 
				}
			}
			else if(move ==2) {
					if(player + 1 <7) {
						game[player + 1] = 2;
						game[player] = 0;
						player += 1;
					}
				}
			}
			
		}
	}


