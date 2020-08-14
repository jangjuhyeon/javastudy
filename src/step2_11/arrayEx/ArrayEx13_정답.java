package step2_11.arrayEx;

/*
 * # 4의 배수만 저장
 * - arr 배열에서 4의 배수만 골라 temp 배열에 저장
 */


public class ArrayEx13_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr = {44, 11, 29, 24, 76};
			int[] temp = null;
			
			int cnt = 0;
			for(int i = 0; i<5;  i++) {
				if(arr[i]%4==0) {
					cnt = cnt + 1;
				}
			}
			
			System.out.println("배열크기 : " + cnt); 
			temp = new int[cnt]; //배열3칸 0-2
			
			int j = 0;
			for(int i=0;i<5;i++) {
				if(arr[i]%4==0) {
					temp[j]=arr[i];
					j += 1;
					
				}
			}
			
			for(int i =0; i<cnt; i++) {
				System.out.println(temp[i] + " ");
			}
				System.out.println();
			
			
			
	}

}
