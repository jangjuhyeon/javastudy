package step1_08.ifEx;

import java.util.Scanner;

import javax.sound.midi.Synthesizer;

/*
 * # 지하철 요금 계산
 * 1. 이용할 정거장 수를 입력받는다.
 * 2. 다음과 같이 정거장 수에 따라 요금이 정산된다.
 * 3. 요금표
 * 1) 1~5	: 500원
 * 2) 6~10	: 600원
 * 3) 11,12 : 650원 (10정거장이후는 2정거장마다 50원추가)
 * 4) 13,14 : 700원 (10정거장이후는 2정거장마다 50원추가)
 * 5) 15,16 : 750원 (10정거장이후는 2정거장마다 50원추가)
 * ... 
 */
// 7.29 (16:48-
public class IfEx18_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(100%60);
		System.out.println(11%2);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이용 할 정거장수 입력 : ");
		int use = scan.nextInt();
		
		int fee = 0;
		if (use < 0 && use <6 ) {
			System.out.println("요금은 500원 입니다.");
		}else if(use > 6 && use < 11) {
			System.out.println("요금은 600원 입니다.");
		}else{
			if(use % 2 == 1) {
				fee = 600;
				System.out.println("기본요금 : " + fee);
				System.out.println("===============");
				
				int add = (use - 10)/2*50; //25
				System.out.println(add);
				
				System.out.println("추가요금 : " + add);

				fee = fee + add + 50;
				System.out.println("최종요금 : " + fee);
				
				
				System.out.println(fee);
			}else if(use % 2 == 0){
				fee = 600;
				System.out.println(fee);
				int add = (use - 10)/2*50;
				System.out.println(add);
				fee = fee + add;
				System.out.println(fee);
			}
			
		}
		
	}

}
