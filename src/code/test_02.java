package code;

import java.util.Scanner;

public class test_02 {

	public static void main(String[] args) {
//		3의 n승 구하기
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 한개 입력해주세요 : ");
		int num = sc.nextInt();
		int result = 1; // 0에 곱하면 0이기 때문에 1로 초기화 해준다!
		
		for(int i=1; i<=num; i++) {
			result *= 3; //result = result * 3;
		}
		System.out.println(result);
	}

}
