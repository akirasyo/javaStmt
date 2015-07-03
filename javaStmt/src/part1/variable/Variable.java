package part1.variable;
/*
 변수 (variable)
 * 데이터 타입에 명시된 형태의 데이터를 담을 수 있는 메모리이다.
 * 변수는 데이터 타입을 통해서 존재할 수 있다
 * 변수를 만드는 이유는 데이터를 보관하기 위해서이다.
 * 변수의 이름은 해당 메모리를 핸들할 수 있는 유일한 수단이다.
 * 변수에는 데이터 타입에 맞는 형의 데이터를 넣어야 한다.

주의사항
	데이터 타입이 선언된 변수는 같은 이름의 변수를 또다시 선언할 수 없다.
	단, 데이터타입과 같이 쓰이지 않는 변수는 재활용이 가능하다.
	
   
 할당(Assignment)
  할당이란 선언한 변수에 값을 집어넣는 행위
 */
public class Variable {
	// 숫자 200을 출력하시오
	// 처음은 main 메소드 만드시오
	public static void main(String[] args) {
		//변수를 선언 및 200 할당
		int a = 200;
		// 콘솔에 출력
		System.out.println("a의 값 = " + a);
		// 출력할때 run as 버튼을 누른다.
		// eclipse 는 이 액션을 한번만 해주면 그 다음부터는 단축키가 기억함.
		// CTRL + F11
		//Q. 변수 abc에 숫자값 2000 출력
		int abc = 2000;
		System.out.println("abc를 출력값 = " + abc);
		// 2200을 출력하시오.
		System.out.println(a+abc );
		//자바에서 변수를 사용하는 이유는 재활용을 위함이다.
		int result;
		result = a + abc;
		System.out.println("a와 abc의 합 : " + result);
		// 가독성 : 뜻이 불분명해지는 것을 막고, 분명한 결과값을 출력하기 위한 코딩
		
		abc = 40000;
		System.out.println("abc에 처음 2000을 넣었다가 40000을 넣은 결과: "+ abc);
	}
}
