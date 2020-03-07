package code;

import java.util.Scanner;

public class test_06 {

	public static void main(String[] args) {
//		복리계산기...
		Scanner sc = new Scanner(System.in);
		System.out.println("이자율을 입력하세요 : ");
		
		//이자율을 쉽게 계산하기 위해 입력받은 값을 미리 가공!
		double yearInterestRate = sc.nextDouble() / 100 + 1; // ex) 이자율 10% 입력시, 1.1!
		double myMoney = 1000;
		int year = 0;
		
		while (true) {
			year++;
			myMoney *= yearInterestRate;
			if (myMoney >= 2000) {
				break;
			}
		}
		System.out.println(year + "년 걸려서 2배를 넘었습니다.");
	}

}
