package part1.array;

import java.util.Scanner;
//1~10까지의 합
public class ForLoopAssign {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] intArr = new int[10];
		int sum = 0;
		for(int i = 0 ; i<intArr.length;i++){
			// 아래의 ?를 몇을 넣어야 for 문 인덱스 값을 활용한 실제 값을 넣을 수 있나요?
			intArr[i] = i+1 ; // 변수 선언을 최소화 하려는 노력의 일환
			sum += intArr[i] ;
		}
		scanner.close();
		System.out.println(sum);
	}
}
/*	기존 배열 정의 방법
	intArr[0] = 1 ;
	intArr[1] = 2 ;
	....
	intArr[9] = 10;
*/