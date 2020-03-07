package code;

public class for_04 {

	public static void main(String[] args) {
//		구구단 2~9단 출력하기
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
			}
		}
	}

}
