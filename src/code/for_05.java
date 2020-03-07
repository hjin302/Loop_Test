package code;

public class for_05 {

	public static void main(String[] args) {
//		별찍기...
		
//		1번
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		2번
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		3번
		for(int i=0; i<5; i++) {
			for(int j=5; j>i+1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		4번ㅠㅠ
		for(int i=0; i<5; i++) {
			for(int j=0; j < 4-i ; j++) { // 공백을 만들어주는 for문
				System.out.print(" ");
			}
			for(int k=0; k<i+1; k++) { // *을 찍는 for문
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
