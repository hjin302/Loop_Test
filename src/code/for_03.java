package code;

public class for_03 {

	public static void main(String[] args) {
//		12와 20의 모든 공약수 출력하기
		
		for(int i=1; i<=20; i++) {
			if(12 % i == 0 && 20 % i == 0) {
				System.out.println(i);
			}
		}
	}

}
