package step1_07.random;

import java.util.Random;

public class RandomEx02_문제 {

	/*
	 * # 코인 게임
	 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
	 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
	 * 3. 동전의 앞뒷면을 맞추는 게임이다.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random ran = new Random();
		
		int coin = ran.nextInt(2); // (0,1,2)
		
		
	}

}
