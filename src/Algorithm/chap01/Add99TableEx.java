package Algorithm.chap01;

public class Add99TableEx {
	//구구단 곱셈표를 변형하여 곱셈이 아니라 덧셈을 출력하는 프로그램을 작성하세요
	public static void main(String[]args) {
		System.out.print("   |");//맨 앞 |
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%3d",i); //상단 | 다음 1,2,3,4,...9
		}
		System.out.println("\n---+---------------------------"); //가로 구분선
			
		for(int i=1;i<=9;i++) {
			System.out.printf("%2d |",i); //세로 숫자 | -> 수직선
			
			for(int j=1; j<=9;j++) {//연산
				System.out.printf("%3d",i+j);//i+j를 정수 3자리 형태 테이블로 출력
			}
			System.out.println();//j가 1~9까지 반복이 끝나면 줄바꿈
			
		}
		
	}
}
