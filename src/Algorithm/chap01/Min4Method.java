package Algorithm.chap01;

public class Min4Method {
//네 값의 최소값을 구하는 min메서드를 작성하세요
	
	static int min4(int a, int b, int c, int d) {
		int min =a;
		
		if(b<min)
			min=b;
		if(c<min)
			min=c;
		if(d<min)
			min=d;
		
		return min;
	}
	
	public static void main(String[]args) {
		System.out.println("min(1,2,3,4)= " +min4(1, 2, 3, 4));
		System.out.println("min(2,2,3,4)= " +min4(2, 2, 3, 4));
		System.out.println("min(3,3,3,4)= " +min4(3, 3, 3, 4));
		System.out.println("min(4,4,5,4)= " +min4(4, 4, 5, 4));
	}
}
