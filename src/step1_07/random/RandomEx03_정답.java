package step1_07.random;

import java.util.Random;

/*
 * # 당첨복권[1단계] 30%의 당첨확률
 */

public class RandomEx03_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		
		int rNum = ran.nextInt(10); //0-9
		if(rNum < 3) {
			System.out.println("당첨");
		}
		
		if(rNum >= 3) {
			System.out.println("꽝");
		}
		
	}

}
