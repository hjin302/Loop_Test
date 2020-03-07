package code;

public class break_continue {

	public static void main(String[] args) {
//		break - 강제로 나온다 ! (더이상 반복을 하지 않아도 될때 사용한다.(특정 조건을 만족할때))
//		 => 35의 1을 제외한 약수중 가장 작은것은?
		
		for (int i=2 ; i <= 35 ; i++) {
			
			if (35 % i == 0) {
				System.out.println(i);
				break;
			}
			
		}
		
		
//		continue - 해당 반복을 스킵하고 넘어간다. (아래에서는 i를 3으로 나눴을때 나머지가 0이면 출력되지 않는다!!) 
//		1~20 사이의 숫자중 3의 배수가 아닌것은?
		
		for (int i=1 ; i<=20 ; i++) {
			
			if (i % 3 == 0) {
				continue;
			}
			
			System.out.println(i);
			
		}
	}

}
