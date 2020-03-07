package code;

import java.util.Scanner;

public class test_05 {

	public static void main(String[] args) {
//		소수판별문제... 
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		boolean isPrimeNumber = true;
		
		for (int i=2 ; i < num / 2 ; i++) {
			if (num % i == 0) { // if문 안으로 들어오면 무조건 소수가 아님!
				isPrimeNumber = false;
				System.out.println("소수가 아닙니다.");
				System.out.println(i + "로 나눠집니다!");
				break;
			}
		}
		
		if (isPrimeNumber) { //true면 if문이 실행된다!
			System.out.println("소수가 맞습니다.");
		}
		
		
	}

}
