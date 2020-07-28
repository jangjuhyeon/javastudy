package step1_07.random;

import java.util.Random;

/*
 * # 랜덤
 */

public class RandomEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random ran = new Random();
		
		// 예) 0 ~ 2 사이의 랜덤
		int rNum = ran.nextInt(3);
		//System.out.println(rNum);
		
		// 문제 1) 1 ~ 5 사이의 랜덤
		//rNum = ran.nextInt(5) + 1; // [0~4] + 1 => [1~5중 랜덤숫자가 나온다는것?)
		
		// 문제2) -3 ~ 3 사이의 랜덤
		rNum = ran.nextInt(7) - 3; // [-3~-1] => 0,1,2,3,4,5,6
								   //			-3-2-10123
		System.out.println(rNum);
				
		
	}

}
