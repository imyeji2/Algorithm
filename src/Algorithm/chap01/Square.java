package Algorithm.chap01;
import java.util.Scanner;

public class Square {
	//입력한 수를 한 변으로 하는 정사각형을 *로 출력하는 프로그램을 작성하세요.
	
	public static void main(String[]args) {
		Scanner sdtIn = new Scanner(System.in);
		int num;
		
		System.out.println("정사각형을 출력합니다.");
		
		do {//양수만 입력받기 위한 while문
			System.out.print("변의 길이 : ");
			num = sdtIn.nextInt();
		}while(num<=0);
		
		for(int i=0; i<num;i++) {//num이 5면 5줄
			for(int j=0; j<num;j++) {//5개 출력
				System.out.print("*");//num만큼 * 출력
			}
			System.out.println();//줄바꿈
		}
	}
}
