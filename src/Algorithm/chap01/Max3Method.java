package Algorithm.chap01;

public class Max3Method {
	//3개의 정수값 가운데 최대값을 구하여 출력,메서드화
	
	/*메서드(Method) = 클래스에 소속된 함수
	 * - 자주 반복하여 사용하는 내용에 대해 특정 이름으로 정의한 묶음
	 * - 클래스 내부에 존재하며 특정기능(Function)을 수행하는 최소 실행 단위
	 * 	 -> 반환값, 메서드 이름, 매개변수(인수)로 구성
	 * - 필요할 때마다 호출하여 원하는 작업 실행
	 * - 불필요한 반복을 제거하여 코드의 재사용성을 높이는 역할
	 * 
	 * 1. 메서드의 종류
	 * 1-1 기본적으로 제공되는 메서드(내장 메서드)
	 *  - System.out.println(), Integer.parseInt(), Character.toUpperCase()등
	 *  
	 * 1-2 사용자 정의 메서드
	 *  - 매개변수가 없는 메서드
	 *  - 매개변수가 있는 메서드
	 *  - 반환값이 있는 메서드
	 *  - 반환없이 없는 메서드
	 *  
	 * 2. 메서드 형식
	 * 접근제한자 	반환형	메서드이름(매개변수){
	 * 	블록;
	 * 	return 반환값;
	 * }
	 * 
	 * 2-1 접근 제한자
	 * - 메서드의 속성으로 메서드를 외부에 있는 클래스에 노출시킬 것인지, 숨길 것인지 등을 결정
	 * - public, private, protected, default
	 * 
	 * 2-2 반환형 
	 * - 작업을 마친 후의 결과를 호출자에게 돌려주는 값의 형태(int, string등 자료형)
	 * - void는 반환값이 없는 메서드라는 뜻
	 * - 반환값이 있는 메서드는 반드시 값을 리턴해야 함
	 * 
	 * 2-3 return
	 * - 메서드 실행을 종료하고 호출원으로 복귀
	 * - 메서드 처리 결과를 호출원으로 돌려주는 기능도 함
	 * - return을 만나면 메서드 내부에서 실행하던 것을 멈추고 자신을 호출한 곳으로 돌아가지만
	 *   return이 없는 메서드는 매서드 내부의 마지막 행까지 실행되고 나서 자신을 호출한 곳으로 돌아감
	 * */

	
	static int max3(int a, int b, int c) {
		//매개변수 : 메서드를 정의할 때 전달되는 값을 저장하기 위한 변수 (int a, int b, int c)
		//a,b,c의 최대값을 구하여 반환
		int max=a;
		if(b>max)
			max=b;
		
		if(c>max)
			max=c;
		
		return max; //구한 최대값을 호출한 곳으로 반환
	}
	
	public static void main(String[]args) {
		//실인수 : 메서드를 호출할 때 사용하는 매개변수 값 max3(3,2,1)
		System.out.println("max3(3,2,1)= " +max3(3, 2, 1));
		System.out.println("max3(3,2,2)= " +max3(3, 2, 2));
		System.out.println("max3(3,1,2)= " +max3(3, 1, 2));
		System.out.println("max3(3,2,3)= " +max3(3, 2, 3));
		System.out.println("max3(2,1,3)= " +max3(2, 1, 3));
		System.out.println("max3(3,3,2)= " +max3(3, 3, 2));
	}
	
	/*알고리즘이란? 
	 * - 어떤 문제를 해결하기 위한 절차로, 명확하게 정의되고 순서가 있는 유한 개의 규칙으로 이루어진 집합
	 */
}
