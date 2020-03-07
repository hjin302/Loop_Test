package code;

import java.util.Scanner;

public class test_07 {

	public static void main(String[] args) {
//		팩토리얼
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		int result = 1; //0*0=0이니까 1로 초기화
		
		for(int i=num; i>=1; i--) {
			result *= i;
		}
		System.out.println(result);
		

	}

}
