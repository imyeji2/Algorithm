package Algorithm.chap01;

import java.util.Scanner;

public class SumFor2 {
	//양수만 입력하여 1부터 n가지의 합 구하기(do-while문)
	
	public static void main(String[]args) {
		Scanner sdtIn = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		do {
			System.out.print("n값 : ");
			n = sdtIn.nextInt();
		}while(n<=0);
		
		int sum =0;
		
		for(int i=1; i<=n;i++) {
			sum+=1;
		}
		
		System.out.println("1부터 " + n + "까지의 합은 "+sum+"입니다.");
	}

	/*do-while문
	 * 무조건 루프 본문을 한 번 실행한 다음에 계속 반복할 것인지를 판단하는 사후판단 반복문
	 * 때문에 n이 0이하이면 다시 입력, 0이상이면 결과 출력
	 * for, while문은 사전 판단문으로 조건에 일치하지 않으면 실행하지 않는게 차이점
	 * 반드시 한 번은 실행하게 하는 경우 do-while문을 사용한다.
	 */
}
