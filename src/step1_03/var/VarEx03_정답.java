package step1_03.var;

public class VarEx03_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//예) 현금이 1000원있다. 200원짜리 과자 구입 후, 잔돈 출력 
		int 현금 = 1000;
		int 과자 = 200;
		int 잔돈 = 현금 - 과자;
		System.out.println("잔돈 = " + 잔돈 + "원");
		
		//문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
		int 월급 = 100;
		int 세전연봉 = 월급*12;
		int 세금 = 세전연봉/10;
		System.out.println(세금);
		int 세후연봉 = 세전연봉-세금;
		System.out.println("세후연봉은 " + 세후연봉 + "원 입니다.");
		
		//문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
		int 점수1 = 30;
		int 점수2 = 50;
		int 점수3 = 4;
		int 총점수 = 점수1 + 점수2 +점수3;
		int 평균 = 총점수/3;
		System.out.println("세과목 평균점수는 " + 평균 + "입니다.");
		
		//문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		int 가로 = 3;
		int 세로 = 6;
		int 넓이 = (가로*세로)/2;
		System.out.println("가로가 3이고, 세로가 6인 삼각형 넓이는 " + 넓이 + "입니다.");
		
		//문제4) 100초를 1분 40초로 출력
		int 분 = 100/60;
		int 초 = 100%60;
		int a = 100%70;
		System.out.println("=============");
		System.out.println(초);
		System.out.println(a);
		System.out.println("100초는 " + 분 + "분" + 초 + "초 입니다.");
		
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
		int 오백원 = 800/500;
		int 백원 = (800%500)/100;
		System.out.println("800원에서 500원짜리 개수는" + 오백원 + "이고," + "100원짜리 개수는 " + 백원 + "입니다" );
		
		//정답5) 500원(1개), 100원(3개)  
	}

}
