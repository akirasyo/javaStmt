package part1.variable;
/*
 기본형 타입 8 가지
 1. 논리형 (1 byte) = true, false 정의
 	boolean - 1byte
 2. 바이트 (1 byte) = 사용을 안함
 	byte - 1byte
 3. 문자 ( 2byte)
 	char - 2byte
 4. 정수 (2,4,8 byte)
 	short - 2byte
 	int - 4byte
 	long - 8byte
 5. 실수 (4,8 byte)
 	float - 4byte
 	double - 8byte
 */
public class PrimitiveType {
	public static void main(String[] args) {
		/*
		 * // 논리형 1바이트, 초기값 : false;
		boolean result = true;
		// 문자형 char : 2바이트 , 초기값 = \u0000 , \ = 역슬래쉬
		char c = 'C'; // 알파벳 한글자를 나타내며 대소문자를 구분한다. 주의!! - 싱글쿼터를 사용
		// 정수형
		byte varByte = 100;  //8비트
		short varShort = 10000; //16비트
		int varInt = 100000000; //32비트
		long varLong = 100L; 	//64비트	  숫자값 뒤에 L를 표기함. 다만 l 보다 L을 추천
		//실수형 = 부동소수점 타입
		float varFloat = 100.00f ;  // 32비트 숫자값 뒤에 f or F 를 표기함.
		double varDouble = 100.00d; //64비트  숫자값 뒤에 d or D 를 표기함.
		//1바이트 = 8비트 , 1비트 = 숫자 0 과 1로 이루어짐
		// 메모리 용량이 늘어난 요즘은 boolean, int, double 사용 
		*/
		// Q. 3.14를 콘솔에 출력
		double d = 3.14d;
		System.out.println("3.14를 출력한 값 : " + d);
	}
}
