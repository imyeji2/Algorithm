package Algorithm.chap01;

public class Max4Method {
	//네 값의 최대값을 구하는 max4 메서드를 작성하세요
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b>max)
			max=b;
		if(c>max)
			max=c;
		if(d>max)
			max=d;
		
		return max;
	}
	
	public static void main(String[]args) {
		System.out.println("max4(1,2,3,4)= "+max4(1, 2, 3, 4));
		System.out.println("max4(1,2,3,5)= "+max4(1, 2, 3, 5));
		System.out.println("max4(5,2,3,4)= "+max4(5, 2, 3, 4));
		System.out.println("max4(1,5,3,4)= "+max4(1, 5, 3, 4));
	}
}
