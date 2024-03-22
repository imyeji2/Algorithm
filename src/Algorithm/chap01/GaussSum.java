package Algorithm.chap01;

import java.util.Scanner;

public class GaussSum {

	//1~10의 합은 (1+10)*5와 같이 구할 수 있는데
	//이를 '가우스 덧셈' 이라고 한다. 이 방법을 이용하여
	//1부터 n까지의 정수 합을 구하는 프로그램을 작성하시오.
	
	public static void main(String[]args) {
		Scanner sdtIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지 정수의 합을 구합니다.");
		System.out.print("n의 값:");
		
		int n = sdtIn.nextInt();
		//변수 초기화
		int sum =0;
		
		//홀수일 때, 짝수일 때 계산법이 다름
		if(n%2==0) {
			sum=(1+n)*(n/2);
		}else {
			sum = (1+n)*(n/2)+(n-n/2);
			
		}
		
		int sum2 = (n+1)*(n/2)+(n%2==1?(n+1)/2:0); //답에서 구한 방식
		//삼항 연산자 사용해서 원래식 + 홀수일때 (n+1)/2, 짝수일 때는 0을 더함
		
		System.out.println("1부터 n까지 정수의 합은 "+sum+"입니다.");
		System.out.println("1부터 n까지 정수의 합은 "+sum2+"입니다.");
		
		
	}
}
