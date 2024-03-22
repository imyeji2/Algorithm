package Algorithm.chap01;

import java.util.Scanner;

public class SumVerbose1 {
	//1부터 n가지의 합과 그 값을 구하는 과정을 출력해라
	
	public static void main(String[]args) {
		Scanner sdtIn = new  Scanner(System.in);
		int n;
		
		System.out.println("1부터 n가지의 합을 구합니다.");
		
		do {
			System.out.print("n값: ");
			n=sdtIn.nextInt();
		}while(n<=0);
		
		int sum = 0;
		
		for(int i=1; i<=n;i++) {
			//과정별 연산자 분류
			if(i<n) {//중간과정
				System.out.print(i+"+");
			}else {//마지막 과정
				System.out.print(i+"=");
			}
			
			//n값에 따라 많은 반복이 수행될 수 있어 비효율적
			//SumVerbose2에서 수정
			sum+=i;
		}
		
		System.out.println(sum);
	}

}
