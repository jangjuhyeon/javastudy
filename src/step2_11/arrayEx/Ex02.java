package step2_11.arrayEx;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int arr[] = {1001, 20, 1002, 45, 1003, 54};
		// 학번과 점수가 한쌍이다 1001:20 , 1002:45  , 1003:54
		
		// 문제1) 학번을 입력하면 점수 출력 
		
		
			for(int i = 0; i<7; i++) {
				System.out.println("학번 입력 : ");
				int hakbun = scan.nextInt();
				if(arr[i]%2 == hakbun) {
					System.out.println("나의 점수는 " + arr[i+1]);
				}
				}
				
			
		}
		
			//for문으로 찾아서 보내
			
			
		}
	
		// 문제2) 점수를 입력하면 학번 출력


	

