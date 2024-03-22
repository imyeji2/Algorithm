package Algorithm.chap01;

import java.util.Scanner;

public class SumOf {

	//정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하여
	//반환하는 메서드를 작성하세요
	//대소 상관 없이(a=3, b=5 =>12 / a=6, b=4 =>15)
	
	static int sumof(int a, int b) {
		
		int sum =0;
		int max=0;
		int min=0;
		
		if(a>b) {
			max=a;min=b;
		}else {
			max=b;min=a;
		}
		
		for(int i=min;i<=max;i++) {
			sum+=i;
		}
		
		return sum;
	}
	
	public static void main(String[]args) {
		Scanner sdtIn = new Scanner(System.in);
		System.out.println("a부터 b까지 모든 정수의 합을 구합니다.");
		
		System.out.print("a의 값 : ");
		int a = sdtIn.nextInt();
		System.out.print("b의 값 : ");
		int b = sdtIn.nextInt();
		
		System.out.println("a부터 b까지 모든 정수의 합은 " +sumof(a, b) + "입니다.");
	}
}
