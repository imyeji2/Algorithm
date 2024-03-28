package Algorithm.chap01;

import java.util.Scanner;

public class NumPira {
	//연습문제 16. 오른쪽과 같이 아래를 향한 n단의 숫자 피라미드를 출력하는 메서드를 작성하세요
	//static void npira(int n)
	
	static void npira(int n) {
		for(int i=1;i<=n;i++) {//출력되는 숫자 기준 앞 공백
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=(i-1)*2+1;j++) { //출력되는 숫자
				System.out.print(i);
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[]args) {
		Scanner sdtIn = new Scanner(System.in);
		int num;
		System.out.println("n단 숫자 피라미드 출력");
		
		do {
			System.out.print("몇 단 피라미드를 출력하시겠습니까? : ");
			num=sdtIn.nextInt();
		}while(num<=0);
		
		npira(num);
		
	}
}
