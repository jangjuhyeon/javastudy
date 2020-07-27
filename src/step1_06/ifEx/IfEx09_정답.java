package step1_06.ifEx;

import java.util.Scanner;

/*
 * # 로그인[3단계]
 * 1. Id를 입력받아 dbId와 일치할 경우에만 Pw를 입력할 수 있다.
 * 2. Id가 틀린 경우, "Id를 확인해주세요"라는 메세지를 출력한다.
 * 3. Pw가 틀린 경우, "Pw를 확인해주세요"라는 메세지를 출력한다.
 * 4. Id와 Pw와 모두 일치하는 경우, "로그인 성공"라는 메세지를 출력한다.
 */

public class IfEx09_정답 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myPw;
		int dbId = 1234;
		int dbPw = 1111;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Id를 입력해주세요");
		int myId = scan.nextInt();
		
		if(dbId == myId) {
			
			System.out.println("Pw를 입력해주세요");
			myPw = scan.nextInt();
			
		if(dbPw == myPw) {
			System.out.println("로그인 성공!");
		}
		if(dbPw != myPw) {
			System.out.println("Pw를 확인해주세요");
			}
		
		}
		
		
		if(dbId != myId) {
			System.out.println("Id를 확인해주세요");
			myId = scan.nextInt();
		}
		if(dbId == myId) {
			System.out.println("Pw를 입력해주세요");
			myPw = scan.nextInt();
		if(dbPw == myPw) {
			System.out.println("로그인 성공");
			
		}
		if(dbPw != myPw) {
			System.out.println("Pw를 확인해주세요");
		}
		}
	}
}
