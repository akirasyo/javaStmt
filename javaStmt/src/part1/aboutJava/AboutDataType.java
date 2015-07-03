package part1.aboutJava;
/* 
1. 데이터 타입이란 ?
  - 메모리를 생성하기 위한 도구
  => 메모리의 크기(size) 와 메모리의 형태 (type) 을 지정하기 위한 도구
  
2. 메모리를 얻고 사용하는 방법
 - 메모리의 크기를 설정
 - 메모리의 식별자(고유 이름) 할당
 - 메모리에 데이터를 입력
 
3. 데이터 타입의 목적
 1. 생성할 메모리 크기 (size) 지정
 2. 메모리의 형태(type) 을 지정
 
4. 사용례  
 */
public class AboutDataType {
	// main 메소드 : 소스를 콘솔창에 띄우는 역할을 하는 함수(=메소드, 자바에서는 메소드라고 함.)
	// main 메소드 단축키 : main + CTRL + space + enter
	public static void main(String[] args) {
	// 1. 변수의 선언 ( 4byte의 메모리 생성)
		int a;
	// 2. 4byte의 메모리에 타입에 맞는 값을 세팅 (할당)
		a = 5;
		System.out.println(a);
		// Question. int 타입의 변수 abc를 선언하세요..
		// Q. qustn abc 에 100을 할당하세요.
			int abc;
			abc = 100;
			System.out.println(abc);
	// 3. 데이터 타입을 선언하고 값을 할당하는 Action 을 1줄로 합치기
		int b = 5;
	// 4. 현재 3번까지의 액션이 HDD 에 저장된 형태이다.
	// 이것을 메모리에 로딩 단계까지 하는 것은 .. 단축키 > syso + CTRL + space
		System.out.println(b);
	// 5. 연산을 통해 결과값을 보여주기 : 
	}
}
