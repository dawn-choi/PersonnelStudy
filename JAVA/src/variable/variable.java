package variable;

public class variable {
	public static void main(String[] args) {
			int a ; //변수 선언
			a = 10;// 변수 초기화
			a = 50;// 변수 값 변경
			// 변수를 선언하면 메모리 공간을 확보 해서 데이터를 저장 시킴, 그 메모리의 이름이 변수명
			
			// 변수 초기화 : initialization, 메모리에 저장된 데이터는 프로그램 종료 시 남아 있을 수 있다.
			// 변수 선언시 변수가 할당 된 메모리에 어떤 데이터가 있을지 모르니 
			// 변수에 특정 값을 넣어 줌으로써 기존에 있던 데이터를 날린다. 이것이 변수 초기화 
			// 따라서 자바는 변수 초기화 전에는 변수를 사용 하지 못하도록 한다
			// % == 나머지구하기 산술 연산자
			// ++a , A++: 증감 연산자
			// 전위 증감연산자, 후위 증감연산자
			
			// 전위 증감 연산자
//			int b = 1;
//			int c = 0;
//			
//			c = ++b; // b의 값을 먼저 증가 시키고 그 결과를 c 에 대입
//			System.out.println("b=" +b +", c = " + c );
			
			// 후위 증감연산자
			
			int b = 1;
			int c = 0;
			
			c = b++; // b의 값을 c 에 대입 후에 b 값을 증가 
			System.out.println("b=" +b +", c = " + c );
			
			
			//비교연산자
			// 문자열은 .equals() 메서드를 사용한다.
			
			//if 문
			
			if(true) {
				System.out.println(1);
			}else {
				System.out.println(2);
			}
			
			//switch 문
			
			int grade = 3;
			
			switch (grade) {
			case 1:
				System.out.println(1);
				break;
			case 2:
				System.out.println(2);
				break;
			default:
				System.out.println(3+"switch");
			}

			// 신규 switch 문
			
			int coupon = switch(grade) {
				case 1 -> 1000;
				case 2 -> 1000;
				case 3 -> 1000;
				default -> 600;
			};
			
			int n = 1;
			
			printNumber((int)n);// 명시적 형변환 int -> double
			printNumber(n);		// 자동 형변환 int -> double  작은것에서 큰것으로는 자동형변환이 가능하나 큰것에서 작은것로느는 불가
			                    // double -> int : X
			
			
	}
	
		public static void printNumber(double n) {
			System.out.println("숫자 " + n);
		}
		
		// 오버로딩
		
		// 파라미터 형변경 가능 
		public static void printNumber(int n) {
			System.out.println("숫자 " + n);
		}
		
		// 파라미터 개수 추가 가능
		public static void printNumber(int n , int b) {
			System.out.println("숫자 " + n);
		}
		
		
		// 반환타입 변경 불가
//		public static double printNumber(String a) {
//			System.out.println("숫자 " +a);
//		}
		
		//메서드 시그니처 == 메서드 이름 + 파라미터 타입 및 순서
		
}
