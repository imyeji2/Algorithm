package Algorithm.chap01;

public class Min3Method {
//세 값의 최소값을 구하는 min메서드를 작성하세요
	static int min3(int a, int b, int c) {
		int min = a;
		if(b<min)
			min=b;
		if(c<min)
			min=c;
		
		return min;
	}
	
	public static void main(String[]args) {
		System.out.println("min(1,2,3)= "+min3(1, 2, 3));
		System.out.println("min(2,2,3)= "+min3(2, 2, 3));
		System.out.println("min(3,1,3)= "+min3(3, 1, 3));
		System.out.println("min(4,1,3)= "+min3(4, 2, 3));
	}
}
