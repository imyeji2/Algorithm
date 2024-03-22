package Algorithm.chap01;

import java.util.Scanner;

public class DigitsNo {
	//양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하시오
	//135를 입력하면 '그 수는 3자리입니다'라고 출력
	
	public static void main(String[]args) {
		Scanner sdtIn = new Scanner(System.in);
		
		System.out.println("입력한 정수의 자리수를 출력합니다.");
		int num =0;
		
		//양수인지 확인
		do {
			System.out.print("정수를 입력하세요 : ");
			num = sdtIn.nextInt();
		}while(num<=0);
		
		int leng = 0; //자리수 표현 변수 초기화
		
		//정수를 10으로 나눠서 0이 될 때 까지 반복하면
		//그 반복 횟수를 누적하면 해당 정수의 자릿수를 구할 수 있음
		while(num>0) {
			num/=10;
			leng++;
		}
		System.out.println("그 수의 자리수는 "+leng+"자리입니다.");
	}
}
