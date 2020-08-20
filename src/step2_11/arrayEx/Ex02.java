package step2_11.arrayEx;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
<<<<<<< HEAD

		int arr[] = { 1001, 20, 1002, 45, 1003, 54 };
		// 학번과 점수가 한쌍이다 1001:20 , 1002:45 , 1003:54

		// 문제1) 학번을 입력하면 점수 출력
		System.out.println("학번 입력 : ");
		int hakbun = scan.nextInt();

		for (int i = 0; i < 6; i++) {
			if (arr[i] == hakbun) {
				System.out.println("나의 점수는 " + arr[i + 1]);

			}
=======
		
		int arr[] = {1001, 20, 1002, 45, 1003, 54};
		// 학번과 점수가 한쌍이다 1001:20 , 1002:45  , 1003:54
		
		// 문제1) 학번을 입력하면 점수 출력 
		/*
		System.out.println("학번 입력 : ");
		int hakbun = scan.nextInt();
		
			for(int i = 0; i<6; i++) {
				if(arr[i] == hakbun) {
					System.out.println("나의 점수는 " + arr[i+1]);
				}
			}
			*/
			int score[] = {1001, 20,43 , 1002 , 54,2 , 1003,76,6};
			
			//12 45 78
			//
			
			// 학번과 국어 수학 점수이다 
			// 예) 1001 == (20 , 43)
			//    1002 == (54 , 2)
			//    1003 == (76 , 6)
			// 문제3)  점수의 합을 입력하면 번호 출력 
			// 예)  63 ==> 1001 
			// 예)  56 ==> 1002
			// 예)  82 ==> 1003
			System.out.println("국어+수학 점수 입력 : ");
			int totJumsu = scan.nextInt();
			
			for(int i = 0; i<9; i++) {
				if(totJumsu == (score[i] + score[i+1])) {
					
					System.out.println("나의 학번은" + score[i-1] + "입니다" );
				}
			}
			


>>>>>>> branch 'master' of https://github.com/jangjuhyeon/javastudy
		}
<<<<<<< HEAD
=======
		
			
			
			
		}
	
>>>>>>> branch 'master' of https://github.com/jangjuhyeon/javastudy
		// 문제2) 점수를 입력하면 학번 출력
		System.out.println("점수 입력 : ");
		int jumsu = scan.nextInt();
		for (int i = 0; i < 6; i++) {
			if (arr[i] == jumsu) {
				System.out.println("나의 학번" + arr[i - 1]);

			}
		
		
		
		

	}

}
}

// for문으로 찾아서 보내

