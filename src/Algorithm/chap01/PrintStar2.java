package Algorithm.chap01;

import java.util.Scanner;

public class PrintStar2 {
	//*를 n개 출력하되 w개마다 줄바꿈(2)
	public static void main(String[]args) {
		Scanner sdtIn = new Scanner(System.in);
		int n,w;
		
		System.out.println("*개를 n개 출력하되 w마다 줄을 바꿔서 출력합니다.");
		
		do {//정수인 n값 입력받기
			System.out.print("n값:");
			n=sdtIn.nextInt();
		}while(n<=0);
		
		do{//정수가 아니거나 w값이 n보다 크면 w값 다시 받기
			System.out.print("w값:");
			w=sdtIn.nextInt();
		}while(n<=0||w>n);
		
		//반복을 n/w만큼 하면서 w번 반복해서 *출력 후 줄바꿈
		//n이 14, w가 5라면 2번 반복하면서 *****를 출력
		for(int i=0; i<n/w; i++) {
			System.out.println("*".repeat(w));
		}
		
		//남아있는 마지막만큼 출력하고 줄바꿈
		//14를 5로 나눈 나머지를 rest에 저장
		int rest = n%w;
		if(rest!=0) {//남아 있는 숫자가 있다면 나머지 만큼 반복해서 출력
			//14/5의 나머지는 4니까 ****출력하고 줄바꿈
			System.out.println("*".repeat(rest));
		}
	}
}
