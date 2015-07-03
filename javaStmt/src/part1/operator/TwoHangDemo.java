package part1.operator;
// *Demo.java 이름이 보이면 Demo는 샘플소스를 뜻하는 접미사이므로 샘플소스를 구현한 클래스라고 인식하면 된다.
public class TwoHangDemo {
	public static void main(String[] args) {
		int x = 20 ;
		int y = 7 ;
		int add, sub, gob, mok, nmg ; // 타입이 같은 변수를 선언할 때는 그루핑이 가능하다.
		add = x + y ;
		sub = x - y ;
		gob = x * y ; 
		mok = x / y ;
		nmg = x % y ;
		// 곱셈기호 : * , 나눗셈의 몫 구하는 기호 : / , 나눗셈의 나머지 구하는 기호 : %, 뺄셈 기호 : - 덧셈기호 : + 일때
		// 곱셈 변수 : gob , 나눗셈의 몫 변수 : mok, 나눗셈의 나머지 변수 : nmg , 뺄셈 변수 : sub 를 출력하시오
		System.out.println("x = " + x + "\ty = "+ y + "\nx + y = " + add + "\nx - y = " + sub + "\nx * y = " + gob + "\nx / y = " + mok + "\nx % y = " + nmg );

	}
}
