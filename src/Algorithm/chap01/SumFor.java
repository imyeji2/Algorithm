package Algorithm.chap01;

import java.util.Scanner;

public class SumFor {

	public static void main(String[]args) {
		
		//1부터 n까지의 정수의 합 구하기(for문)
		Scanner sdtIn = new  Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n값 : ");
		int n = sdtIn.nextInt();
		
		int sum =0;
		
		for(int i=1;i<=n;i++) {
			sum += i;
		}
		
		System.out.println("1부터 "+ n +"까지의 합은 " +sum+"입니다.");
		
		/*2.for문
		 * 하나의 변수를 사용하는 반복문은 while보다 for문을 사용하는 것이 좋다.
		 * for(초기화 부분; 제어식 ; 증감식) 명령문
		 * 
		 * */
	}
}
