package part1.aboutJava;

public class DataType {
	/* { , } 는 브레이스 라고 부르며, {} 합쳐서는 클래스 바디(class body) 라고 부른다.
	   현재 파일을 저장할시 CTRL + s , 모든 파일을 저장할시 CTRL + Shift + s
	   저장은 습관적으로 진행한다.
	 */
	/* 콘솔창에 보여지는 내용은 나중에 웹 개발과정(JEE, JSP 과정)  에서 화면(브라우저)에 보여지는 내용임.
	 그리고 코딩한 내용을 콘솔에 보여지도록 하는 함수(자바에서는 함수를 "메소드" 라고 칭함)
	 를 main() 메소드라고 한다.
	 단축키 : main + CTRL + space + enter */
	public static void main(String[] args) {
		// 당분간 별 말이 없으면 무조건 메소드 바디 내부에 코딩함
			//Q. 숫자타입의 변수 num 을 생성하고, 100을 할당하시오.
			int num = 100; // ; = 구분자
			// syso + CTRL + SPACE 단축키는 콘솔에 결과값을 출력하라는 기능의 단축키
			System.out.println(num); // 이 액션을 sysout 메소드의 파라미터 값으로 num을 넘겨준다.
	}
}
