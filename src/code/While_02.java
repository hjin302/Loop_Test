package code;

public class While_02 {

	public static void main(String[] args) {
//		do whlie문 - 최소 한번 실행!
		
		int i = 20;
		
		while(i > 10) {
			System.out.println("while반복 : " + i);
			i--;
		}
		
		
		do {
			System.out.println("while반복 : " + i);
			i--;
		} while (i > 10);
		
	
	}

}
