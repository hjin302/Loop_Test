package code;

import java.util.Scanner;

public class test_01 {

	public static void main(String[] args) {
//		입력한 숫자 까지의 총 합 구하기
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 한개 입력해주세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum += i; //sum = sum + i;
		}
		System.out.println(sum);
		
	}

}
