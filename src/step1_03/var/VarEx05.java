package step1_03.var;

public class VarEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// X와 y의 값 교체하기.
		int x = 10;
		int y = 20;
		System.out.println(x);
		System.out.println(y);
		
		int z = x;
		System.out.println(z);
		x = y;
		System.out.println(x);
		System.out.println(y);
		y = z;
		System.out.println(z);
		
		System.out.println("X = " + x);
		System.out.println("y = " + y);

		

	}

}
