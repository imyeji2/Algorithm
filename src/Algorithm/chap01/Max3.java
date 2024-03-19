package Algorithm.chap01;

import java.util.Scanner;

public class Max3 {
	public static void main(String[]args) {
		//변수 a,b,c에 값을 입력받아 세 값의 최대값 구하기 p.13
		Scanner stdIn = new Scanner(System.in);//키보드 입력을 위한 scanner
		
		System.out.println("세 정수의 최대값을 구합니다.");
		System.out.print("a의 값 : "); int a = stdIn.nextInt(); //a값 입력
		System.out.print("b의 값 : "); int b = stdIn.nextInt(); //b값 입력
		System.out.print("c의 값 : "); int c = stdIn.nextInt(); //c값 입력
	
		//a,b,c의 최대값을 구하여 max에 대입
		int max=a; //max 초기값 세팅
		if(b>max) max=b;//b가 max보다 크면 최대값은 b
		if(c>max) max=c;//c가 max보다 크면 최대값은 c 

		System.out.println("최대값은 " + max +"입니다.");		
	}	
}
