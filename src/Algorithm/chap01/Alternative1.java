package Algorithm.chap01;

import java.util.Scanner;

public class Alternative1 {
	//+와 -를 번갈아 출력하기
	public static void main(String[]args) {
		Scanner sdtIn = new Scanner(System.in);
		int n;
		
		System.out.println("+와 -를 번갈아 n개 출력합니다.");
		System.out.print("n값 : ");
		n=sdtIn.nextInt();
		
		/*1. 반복할 때 마다 if문 수행, 변경에 유연하게 대응하기 어려움
		for(int i=0;i<n;i++) {
			if(i%2==0) {//짝수
				System.out.print("+");
			}else {//홀수
				System.out.print("-");
			}
		}
		*/
		
		for(int i=0; i<n/2;i++) {//+-가 반복인 구조로 잡고 n-1의 절반만큼만 반복 ->반복 실행 감소
			System.out.println("+-");//+-를 한번에 출력
		}
		
		if(n%2!=0) {//홀수의 경우 마지막 + 출력을 위해 판단->판단은 단 1번만 하면 됨(감소)
			System.out.println("+");
		}
	}
}
