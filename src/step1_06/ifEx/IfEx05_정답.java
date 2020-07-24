package step1_06.ifEx;

import java.util.Scanner;

/*
 * # 로그인[2단계]
 * 1. Id와 Pw를 입력받아 회원가입을 진행한다.
 * 2. 이후 로그인을 위해 다시 Id와 Pw를 입력받는다.
 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
 * 예) 로그인 성공 or 로그인 실패
 */

public class IfEx05_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dbId = 0;
		int dbPw = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("=== 회원가입 ===");
		System.out.println("회원가입. Id입력 : ");
		dbId = scan.nextInt();
		System.out.println("회원가입. Pw입력 :  ");
		dbPw = scan.nextInt();
		System.out.println("회원가입을 축하합니다. ");
		System.out.println("=== 로그인 ===");
		System.out.println("로그인을 위해 id와 비밀번호를 입력해주세요");
		int id  = scan.nextInt();
		int pw  = scan.nextInt();
		
		if(dbId == id && dbPw == pw) {
			System.out.println("로그인 성공");
		}
		
		if(dbId != id || dbPw != pw) {
			System.out.println("로그인 실패");
			
		}
		
		
		
		
				
		
		
	}

}
