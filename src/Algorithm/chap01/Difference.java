package Algorithm.chap01;

import java.util.Scanner;

public class Difference {
	//두 변수 a,b에 정수를 입력하고 b-a를 출력하는 프로그램을 작성하세요
	//변수 b에 입력한 값이 a값 이하면 변수 b를 다시 입력하세요
	
	public static void main(String[]args) {
		Scanner sdtIn = new Scanner(System.in);
		
		System.out.println("b-a를 출력하는 프로그램");
		
		System.out.print("a값 : ");
		int a = sdtIn.nextInt();
		int b=0;
		
		while(true){
			System.out.print("b값 : ");
			b = sdtIn.nextInt();
			if(b>=a) break;
			System.out.println("a보다 큰 값을 입력하세요!");
		}
		System.out.println("b-a는 " + (b-a) +"입니다.");
	}
	
	/*반복문에서 흐름제어문 break, continue, return 차이
	 * 1.break - 자신이 포함된 가장 가까운 반복문을 탈출, 제어문에선 감싸고 있는 제어문의 블록 탈출
	 * 2.continue - 남아있는 수행문을 실행하지 않고 다음 반복문 실행
	 * 3.return - 자신이 속해있는 메소드 실행 중단
	 * */
}
