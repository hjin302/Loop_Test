package code;

import java.util.Scanner;

public class test_08 {

	public static void main(String[] args) {
//		입력받은 수의 각 자리 합 계산하기 ex) 123 => 1+2+3=6
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		while(true) {
//			ex) num(입력받은값)이 123일경우 => sum += 123%10(=나머지 3을 sum에 저장!)
			sum += num % 10;//sum = sum + num % 10;
			
//			ex) num(입력받은값)이 123일경우 => num = 123/10(=12를 num에 저장!)
			num /= 10;//num = num / 10;
			if(num==0) {
				break;
			}
		}
		System.out.println(sum);
		
	}

}
