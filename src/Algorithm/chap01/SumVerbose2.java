package Algorithm.chap01;

import java.util.Scanner;

public class SumVerbose2 {
	//1부터 n가지의 합과 그 값을 구하는 과정을 출력해라(수정)
	
	public static void main(String[]args) {
		Scanner sdtIn = new  Scanner(System.in);
		int n;
		
		System.out.println("1부터 n가지의 합을 구합니다.");
		
		do {
			System.out.print("n값: ");
			n=sdtIn.nextInt();
		}while(n<=0);
		
		int sum = 0;
		
		for(int i=1;i<n;i++) {//반복문을 n-1까지만 수행->반복 횟수도 감소
			System.out.print(i+"+");
			sum+=i;
		}
		
		//반복문의 마지막은 n이니 if문 대신 이렇게 가능->if문으로 판단도 감소
		//System.out.print(n+"=");
		//sum+=n;
		//System.out.println(sum);
		//위의 과정을 한 줄로 나타 낼 수 있음
		System.out.println(n+"="+(sum+=n));
	}
}
