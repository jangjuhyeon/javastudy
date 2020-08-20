package step2_11.arrayEx;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int arr[] = { 1001, 20, 1002, 45, 1003, 54 };
		// 학번과 점수가 한쌍이다 1001:20 , 1002:45 , 1003:54

		// 문제1) 학번을 입력하면 점수 출력
		System.out.println("학번 입력 : ");
		int hakbun = scan.nextInt();

		for (int i = 0; i < 6; i++) {
			if (arr[i] == hakbun) {
				System.out.println("나의 점수는 " + arr[i + 1]);

			}
		}
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

