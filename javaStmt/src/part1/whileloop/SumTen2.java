package part1.whileloop;

public class SumTen2 {
	public static void main(String[] args) {
		// While 문 1~10까지 합
		int num = 0, sum =0 ; // => For 문의 초기값 설정과 일치
		while (num<=10) { // => 한계값 설정, For 문의 리미트값과 일치
			sum += num ; // => sum = sum + num 의 축약문
			num ++; // num = num +1 의 축약문       증감값 설정 -> For 문의 증감식과 일치
		}
		System.out.println(sum);
		// Do - While 문 1부터 10까지 합
		int num2 = 0 , sum2 = 0; // => 초기값 설정
		do {
			 sum2 += num2 ;
			 num2 ++ ; // => 증감값 설정
		} while (num2<=10); //=> 한계값 설정
		System.out.println(sum2);
		// For 문 1부터 10까지 합
		int sum3 = 0 ;
		for(int num3 =0 ;num3<=10;num3++){
			sum3 += num3;
		}
		System.out.println(sum3);
	}
}
