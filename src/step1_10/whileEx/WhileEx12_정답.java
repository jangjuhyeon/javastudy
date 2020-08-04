package step1_10.whileEx;

/*
 * # 369게임[2단계]
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 */

public class WhileEx12_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;

		while(i <= 50) {
			int x = i / 10; //10의자리
			int y = i % 10; //1의자리
			
			System.out.println("x값은 : " + x);
			System.out.println("y값은 : " + y);
			
			int cnt = 0;
			if(x != 0 && x%3 == 0) {
				cnt = cnt + 1;
			}
			if(y != 0 && y % 3 ==0) {
				cnt = cnt + 1;
			}
			
			
			if(cnt == 2) {
				System.out.println("짝짝");
			}
			else if(cnt ==1 ) {
				System.out.println("짝");
			}
			else {
				System.out.println(i);
			}
			i+=1;
		}
	
	}
}
