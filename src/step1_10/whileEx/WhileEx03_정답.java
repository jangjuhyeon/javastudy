package step1_10.whileEx;

//# 반복문 기본문제[2단계]

public class WhileEx03_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제1) 1~5까지의 합 출력
		// 정답 1) 15
		int i = 1;
		int total = 0;

		while(i <= 5) {
			total = total + i;
			i=i+1;
		}
		System.out.println(total);
		System.out.println("======");
		// i = 1 -> 0 + 1 = 1
		// i = 2 -> 1 + 2 = 3
		// i = 3 -> 3 + 3 = 6
		// i = 4 -> 6 + 4 = 10
		// i = 5 -> 10 + 5 = 15
		
		
		// 문제2) 1~10까지 반복해 3미만 7이상만 출력
		// 정답2) 1, 2, 7, 8, 9, 10
		 i = 1;
		 while(i <= 10) {
			 if(i>=7 || i<3) {
				 total = total + i;
				 System.out.print(i + " ");
				 System.out.println(total + " ");
				 
			 }
			 i = i + 1;
		 }
		 System.out.println("\n"+"=====");
		 
		
		// 문제3) 문제2의 조건에 맞는 수들의 합 출력
		// 정답3) 37
		 i = 1;
		 total = 0;
		 while(i <= 10) {
			 if(i>=7 || i<3) {
				 total = total + i;
				 System.out.print(i + " "+"\n");
				 System.out.print(total + " ");
			 }
			 i = i + 1;
		 }
		 System.out.println("\n"+"=====위에하는중");
		 System.out.println("total " + " = " + total);
		 
		 //
		
		// 문제4) 문제2의 조건에 맞는 수들의 개수 출력
		// 정답4) 6 
		 i = 1;
		 int count = 0;
		 while(i <= 10) {
			 if(i>=7 || i<3) {
				 // i = 1 2 7 8 9 10 
				 count = count + 2;
				 // count = 0 + 2
				 // count = 2 + 2
				 // count = 4 + 2
				 // count = 6 + 2
				 // count = 8 + 2
				 // count = 10 + 2 = 12;
			 }
			 i = i + 1;
		 }
		 System.out.println("count" + count);
		
		 



	}

}
