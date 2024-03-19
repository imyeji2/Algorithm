package Algorithm.chap01;

import java.util.Scanner;

public class JudgeABCD1 {
	//정수 1=A, 2=B, 3=C를 판단.
	public static void main(String[]args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요");
		int n = stdIn.nextInt();
		
		/*이렇게 하면 1과 2가 아닌 모든 숫자는 C가 됨
		 * 		
		if(n==1) {
			System.out.println("A");
		}else if(n==2) {
			System.out.println("B");
		}else {
			System.out.println("C");
			}
		*/
		
		if(n==1) {
			System.out.println("A");
		}else if(n==2) {
			System.out.println("B");
		}else if(n==3) {
			System.out.println("C");
		}else {
			; //1,2,3이외에는 작동 x
		}

	}
}
