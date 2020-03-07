package code;

public class for_02 {

	public static void main(String[] args) {
//		1~20까지의 숫자중 3의 배수만 화면에 출력하기
		
		for(int i=1; i<=20; i++) {
			if(i % 3 ==0) {
				System.out.println(i);
			}
		}
	}

}
