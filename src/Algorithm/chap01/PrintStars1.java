package Algorithm.chap01;

import java.util.Scanner;

public class PrintStars1 {
	//*를 n개 출력하되 w개마다 줄바꿈(1)
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
		
		for(int i=0; i<n; i++) {//n까지 *출력
			System.out.print("*");
			if(i%w==w-1) {//i값을 w로 나눈 값이 w-1이면 줄바꿈, i가 0부터 시작이라 w-1
				System.out.println();
			}
		}
		
		if(n%w!=0) {//n값이 w값의 배수가 아닐 때 줄바꿈
			System.out.println();
		}
	}
	
	//for문을 반복할 때마다 if문을 실행하므로 비효율적,PrintStar2와 같이 개선 가능
}
