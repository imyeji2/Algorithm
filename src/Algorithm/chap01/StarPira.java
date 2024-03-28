package Algorithm.chap01;

import java.util.Scanner;

public class StarPira {
	//연습문제 15.n단의 피라미드를 출력하는 메서드를 작성하세요
	//static void spira(int n)
	//i행에는 (i-1)*2+1개의 *가 출력
	//마지막 n행에는 (n-1)*2+1
	static void spira(int n) {
		
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=(i-1)*2+1;j++){
				System.out.print("*");
			}

			System.out.println();
		}
		
		
	}
		
	public static void main(String[]args) {
		Scanner sdtIn = new Scanner(System.in);
		int n;
		do {
			System.out.print("몇 단의 피라미드를 출력합니까? : ");
			n=sdtIn.nextInt();
		}while(n<=0);
		spira(n);
		
		
	}
}

