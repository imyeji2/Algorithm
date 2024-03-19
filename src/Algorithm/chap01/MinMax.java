package Algorithm.chap01;

import java.util.Scanner;

public class MinMax {
//세 값의 대소 관계인 13가지 조합의 중앙값을 구하여 출력하는 프로그램 작성
	
	static String minMax(int a, int b, int c) {
		if(a>=b) {
			if(a>b) {
				if(b>=c) {
					if(b>c) {
						return a+">"+b+">"+c;
					}else {
						return a+">"+b+"="+c;
					}
				}else if(a>=c) {
					if(a>c) {
						return a+">"+c+">"+b;
					}else {
						return a+"="+c+">"+b;
					}
				}else {
					return c+">"+a+">"+b;
				}
			}else if(b>=c) {
				if(b>c) {
					return a+"="+b+">"+c;
				}else {
					return a+"="+b+"="+c;
				}
			}else {
				return c+">"+a+"="+b;
			}
		}else {
			if(a>=c) {
				if(a>c) {
					return b+">"+a+">"+c;
				}else {
					return b+">"+a+"="+c;
				}
			}else if(b>=c) {
				if(b>c) {
					return b+">"+c+">"+a;
				}else {
					return b+"="+c+">"+a;
				}
			}else {
				return c+">"+b+">"+a;
			}

		}
	}
	
	public static void main(String[]args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("대소 관계 파악을 위한 값을 입력해주세요");
		System.out.print("값 a : ");
		int a = stdIn.nextInt();
		System.out.print("값 b : ");
		int b = stdIn.nextInt();
		System.out.print("값 c : ");
		int c = stdIn.nextInt();
		
		System.out.println("입력한 값의 대소 관계는 "+minMax(a, b, c));
	}
}


//연습문제 Q5(P.22)
//중앙값을 구하는 메서드는 다음과 같이 작성할 수도 있습니다.
//그러나 실습 1C-1의 med3메서드에 비해 효율이 떨어지는데 그 이유를 설명하세요

/*
 * 	static int med3(int a, int b, int c) {
		if ((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if ((a > b && c < b) || (a < b && c > b))
			return b;
		return c;
	}
 * 
 * 	static int med3(int a, int b, int c) {
		if(a>=b)
			if(b>=c)
				return b;
			else if(a<=c)
				return a;
			else
				return c;
		else if(a>c)
			return a;
		else if(b>c)
			return c;
		else
			return b;
	}
	
	전체적으로 같은 판단을 여러번 중복하고 있기 때문에 효율이 떨어진다.
 * 
 */