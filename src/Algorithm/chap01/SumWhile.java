package Algorithm.chap01;

import java.util.Scanner;

public class SumWhile {
	public static void main(String[]args) {
		
		//1부터 n까지 정수의 합 구하기
		Scanner sdtIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n값:");
		int n = sdtIn.nextInt();
		
		int sum =0; //합 저장 변수 초기화
		int i=1; //시작값
		
		while(i<=n) { //1부터 n가지 반복
			sum+=i; //sum에 i 더하기
			i++; //i값 1씩 증가
			
			//연습문제 Q6. while문이 종료될 때 변수값 i가 n+1이 되는지 변수 i값을 출력하도록 수정
			System.out.println("i값은 = " +i);
		}
		
		System.out.println("1부터 " + n +"까지의 합은 " +sum+" 입니다.");
		
		/* 반복문
		 * 조건이 성립하는 동안 처리를 반복하여 실행하는 것, 루프라고 부름
		 * 1. while문
		 * while문은 실행 전 반복을 계속할지를 판단 -> 사전 판단 반복
		 * while(제어식) 명령문
		 */

	}
}
