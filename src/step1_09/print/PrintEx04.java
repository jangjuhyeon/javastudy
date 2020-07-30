package step1_09.print;

public class PrintEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%d", 10); // %d : 정수
		System.out.println();
		System.out.printf("%f\n" , 3.14); // %f : 소수
		System.out.printf("%.2f\n" , 3.14); //★소수점2번째자리까지출력
		
		System.out.printf("%c\n", 'b'); // %c : 문자 1개
		
		System.out.printf("%s\n", "출력문의 이해"); // %s : 문자 여러개
		
		String fruit = "사과";
		int cnt = 5;
		System.out.printf("%s가 %d개 있습니다. \n", fruit,cnt);
		
	}

}
