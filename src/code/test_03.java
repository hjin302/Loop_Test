package code;

import java.util.Scanner;

public class test_03 {

	public static void main(String[] args) {
//		두 숫자의 최대 공약수 / 최소 공배수 구하기
		Scanner sc = new Scanner(System.in);
		System.out.println("정수1을 입력해주세요 : ");
		int num1 = sc.nextInt();
		System.out.println("정수2를 입력해주세요 : ");
		int num2 = sc.nextInt();
		int max =0;
		int min=0;
		
//		최대공약수
		for(int i=1; i<=num1*num2; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				max = i; //공약수중 가장 마지막 값이 최대공약수!
			}
		}
		System.out.println("최대공약수는 " + max + "입니다.");

//		최소공배수
		for(int i=1; i<=num1*num2; i++) {
			if(i % num1  == 0 && i % num2== 0) {
				min = i;
				break; //공배수중 가장 첫번째 값이 최소공배수!
			}
		}
		System.out.println("최소공배수는 " + min + "입니다.");
	}

}
