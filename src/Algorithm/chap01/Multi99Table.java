package Algorithm.chap01;

public class Multi99Table {
	public static void main(String[]args) {
		//이중 루프로 구구단 곱셈표 출력
		System.out.println("----------구구단 곱셈표----------");
		
		for(int i=1; i<=9;i++) {
			for(int j=1; j<=9;j++) {
				System.out.printf("%3d",i*j);//i*j를 3자리로 출력
				/*printf -> 형식화된 출력
				 * - System.out.printf("출력 서식",출력할 내용);
				 * -1.출력 서식 
				 * 	- %[-][0][n][.m]지시자
				 * 	- 출력 서식의 지시자를 제외한 나머지는 생략 가능
				 * 	- n : 출력할 전체 자리수 지정(오른쪽 정렬) ->%3d , 전체 자리수가 3인 정수
				 * 	- 0 : 전체 자리수가 지정딘 경우 왼쪽 정렬하고 빈칸에 공백 출력
				 * 	- .m : 소수점 아래 자리수 지정, 잘리느 소수점 자리수는 반올림 시켜 표시 -> 3.2f
				 * - 2.지시자
				 *  - %b : bollean 형식으로 출력
				 *  - %d : 정수 형식으로 출력
				 *  - %o : 8진수정수의 형식으로 출력
				 *  - %x 또는 %X : 16진수 정수의 형식으로 출력
				 *  - %f : 소수점 형식으로 출력
				 *  - %c : 문자 형식으로 출력
				 *  - %n : 줄바꿈 기능
				 *  - %e 또는 %E : 지수 표현식의 형식으로 출력
				 */
			}
			System.out.println();
		}
	}
}
