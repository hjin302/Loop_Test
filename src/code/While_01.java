package code;

public class While_01 {

	public static void main(String[] args) {
//		1 ~ 10을 순서대로 출력하기
		int i = 1;
		
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
//		20 ~ 10을 순서대로 출력하기
		i = 20;
		while(i>=10) {
			System.out.println(i);
			i--;
		}
	}

}
