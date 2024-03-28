package Algorithm.chap01;

import java.util.Scanner;

public class Triangle {
	//연습문제 14. 직각이등변삼각형을 출력하는 아래와 같은 형식의 메서드로 작성
	//static void triangleLB(int n)->왼쪽아래가 직각인 이등변삼각형
	//static void triangleLU(int n)->왼쪽 위가 직각인 이등변삼각형
	//static void triangleRU(int n)->오른쪽 위가 직각인 이등변삼각형
	//static void triangleRB(int n)->오른쪽 아래가 직각인 이등변삼각형
	
	static void triangleLB(int n) {//왼쪽 아래가 직각인 이등변삼각형
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void triangleLU(int n) {//왼쪽 위가 직각인 이등변삼각형
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n+1)-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

	static void triangleRU(int n) {//오른쪽 위가 직각인 이등변삼각형
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

	static void triangleRB(int n) {//오른쪽 아래가 직각인 이등변삼각형
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[]args) {
		Scanner sdtIn = new Scanner(System.in);
		int n;
		System.out.println("이등변 삼각형 출력");
		
		do {
			System.out.print("몇 단 삼각형 입니까? : ");
			n=sdtIn.nextInt();
		}while(n<=0);
		
		triangleLB(n);
		System.out.println("-----------------------------");
		triangleLU(n);
		System.out.println("-----------------------------");
		triangleRU(n);
		System.out.println("-----------------------------");
		triangleRB(n);
	}
}
