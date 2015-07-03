package part1.whileloop;

public class WhileLoopDemo {
	public static void main(String[] args) {
		int count = 1 ;
		/*
		 int count = 0; 이라고 주는 것은 count 변수를
		 0 으로 초기화(initialize) 한다고 한다.
		 그런데 정수형 타입인 int 의 디폴트 값인 0 으로 주지 않고
		 1 로 주는 것을 count 변수를 1 로 초기화 한다고라고 지칭함.
		 */
		while(count < 11){ // count 가 11 보다 작은 상태 일때만...
		//	sum = sum + count ;
			System.out.println("[1]1부터 10까지의 범위안에 있는 수 들은" + count + "입니다.");
			count++ ;
		}
		/*
		초기값과 조건식(컨디션)과 출력문과의 상관관계
		[1] 컨디션 + 연산식 + 출력문
			초기값을 0 으로 설정, 리미트값(한계값)은 범위값 미만으로 설정
		[2] 컨디션 + 출력문 + 연산식
			초기값을 1로 설정, 리미트값(한계값)을 범위값보다 1큰값 미만으로 설정
		 */
	}
}
