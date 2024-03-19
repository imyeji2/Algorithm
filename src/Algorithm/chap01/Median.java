package Algorithm.chap01;

import java.util.Scanner;

public class Median {
//3개의 정수값을 이비력하고 중앙값을 구하여 출력

/*결정 트리(decision tree)
 * - 조합을 나열한 모양이 나무 형태
 * - 결정 트리는 왼쪽에서 시작하여 오른쪽으로 나아감
 * - 조건이 성립하면 윗가지로, 성립하지 않으면 아랫가지로 나아감
 * */
	
	static int med3(int a, int b, int c) {
		if(a>=b)
			if(b>=c)
				return b;
			else if(a<=c)
				return a;
			else
				return c;
		else if(a>c)
			return a;
		else if(b>c)
			return c;
		else
			return b;
	}
	
	public static void main(String[]args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.print("a의 값: ");
		int a = stdIn.nextInt();
		System.out.print("b의 값: ");
		int b = stdIn.nextInt();
		System.out.print("c의 값: ");
		int c = stdIn.nextInt();
		
		System.out.println("중앙값은 " +med3(a, b, c) + "입니다.");
	
	}
}
