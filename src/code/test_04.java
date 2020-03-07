package code;

import java.util.Scanner;

public class test_04 {

	public static void main(String[] args) {
//		좌표 출력하기
		
//		1.전체 좌표 출력하기
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("[" + i + "," + j + "]");
			}
			System.out.println();
		}
		
//		2.가운데 줄만 세로로 출력하기.
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j == 2) {
					System.out.print("[" + i + "," + j + "]");
				}else {
					System.out.print("     ");
				}
			}
			System.out.println();
		}


//		3.우상향 대각선 그리기
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i+j == 4) {
					System.out.print("[" + i + "," + j + "]");
				}else {
					System.out.print("     ");
				}
			}
			System.out.println();
		}
		
//		4.X자 그리기
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i+j==4 || i==j) {
					System.out.print("[" + i + "," + j + "]");
				}else {
					System.out.print("     ");
				}
			}
			System.out.println();
		}
	}

}
