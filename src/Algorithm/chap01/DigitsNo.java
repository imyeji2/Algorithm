package Algorithm.chap01;

import java.util.Scanner;

public class DigitsNo {
	//양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하시오
	//135를 입력하면 '그 수는 3자리입니다'라고 출력
	
	public static void main(String[]args) {
		Scanner sdtIn = new Scanner(System.in);
		
		System.out.println("입력한 정수의 자리수를 출력합니다.");
		int num =0;
		
		do {
			System.out.print("정수를 입력하세요 : ");
			num = sdtIn.nextInt();
		}while(num<=0);
		
		int leng = 0;
		
		while(num>0) {
			num/=10;
			leng++;
		}
		System.out.println("그 수의 자리수는 "+leng+"자리입니다.");
	}
}
