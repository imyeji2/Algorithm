package Algorithm.chap01;

import java.util.Scanner;

public class TwoDigits {
	//2자리 양수(10~99)를 입력받는 프로그램
	public static void main(String[]args) {
		Scanner sdtIn = new Scanner(System.in);
		int no;
		
		System.out.println("2자리의 양수를 입력하세요.");
		
		do {//2자리 양수인지 확인(10~99인지)
			System.out.print("no값:");
			no = sdtIn.nextInt();
		}while(no<10 || no>99);//no가 10보다 작거나 99보다 크면 false
		
		//드모르간 법칙 : 각 조건을 부정하고 논리곱을 논리합으로 논리합을 논리곱으로 바꾸고
		//전체를 부정하면 원래의 조건과 같다->while(!(no=>10 && no<=99));
		//no가 10보다 크거나 같고 99보다 크거나 같으면 -> no가 10~99이면 ->not으로 전체 부정 ->no가 10~99가 아니면
		
		/*논리 연산자 AND(&&) OR(||)
		 * AND의 경우 조건1 && 조건2의 경우 두 조건 1과 2 모두가 만족해야 TRUE
		 * OR의 경우 조건1 || 조건2의 경우 둘 조건 중 하나만 만족해도 TRUE
		 * 이처럼 식 전체가 아닌 한쪽 평가만으로 결정되는 경우 다음 피연산자를 평가하지 않는데 이를 단축 평가라고 한다.
		 * */
		System.out.println("변수 no값은 "+no+"이 되었습니다.");
	}
	
	//구조적 프로그래밍이란?
	//입력하는 곳 하나와 출력하는 곳 하나를 갖는 구성 요소만을 사용하여,
	//이들을 계층적으로 배치하여 프로그램을 구성하는 방식을 구조적 프로그램이라 한다.
	//순차, 선택, 바나복이라는 세 종류의 흐름제어를 사용함
}
