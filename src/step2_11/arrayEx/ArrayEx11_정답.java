package step2_11.arrayEx;

import java.util.Random;

/*
 * # 중복숫자 금지[1단계]
 * 1. 0~4 사이의 숫자를 arr배열에 저장한다.
 * 2. 단, 중복되는 숫자는 없어야 한다.
 * 힌트) 랜덤 숫자를 check배열의 인덱스로 활용한다.
 * 
 * 예)
 * 랜덤숫자 : 1
 * check = {0, 1, 0, 0, 0}
 * arr   = {1, 0, 0, 0, 0}
 * 랜덤숫자 : 3
 * check = {0, 1, 0, 1, 0}
 * arr   = {1, 3, 0, 0, 0}
 * 랜덤숫자 : 2
 * check = {0, 1, 1, 1, 0}
 * arr   = {1, 3, 2, 0, 0}
 */

public class ArrayEx11_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int[] check = new int[5];
		int[] arr = new int[5];
		/*
		 * # 중복숫자 금지[1단계]
		 * 1. 0~4 사이의 숫자를 arr배열에 저장한다.
		 * 2. 단, 중복되는 숫자는 없어야 한다. -? 
		 * 힌트) 랜덤 숫자를 check배열의 인덱스로 활용한다. -???,,
		 */
		for(int i = 0; i<5; i++) {
			int rd = ran.nextInt(5); //ex)2
			arr[i]  = rd; //arr[0] = 2 // 1번
			
			if(check[rd]==0) {
				check[rd] =1;
			}else {
				i -= 1; //겹치면 되돌아가기.
			}
			
		}

		for(int i = 0; i<5; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
	

}
