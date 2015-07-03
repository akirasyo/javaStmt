package part1.whileloop;

import java.util.Scanner;

public class OddEvenSum {
	public static void main(String[] args) {
		int num = 1, sum = 0, oddSum = 0, evenSum = 0 ; // 지역변수는 초기화 필수
		Scanner scanner = new Scanner(System.in);
		while(num<=10){
			sum += num; 
			num ++ ;
		}
		System.out.println(sum);
		// 위의 while문을 for문으로 변경
		sum = 0 ;
		for(num =1 ; num<= 10 ; num ++){
			sum += num ;
		}
		System.out.println(sum);
		// While 문으로 홀수, 짝수의 합 
		num = 1 ; 
		while(num <= 10){
			oddSum += num ;
			num += 2 ;
		}
		System.out.println("홀수의 합 : " + oddSum);
		for(num = 0 ; num <=10 ; num+=2){
			evenSum += num ;
		}
		System.out.println("짝수의 합 : " + evenSum);
		// For + if 문을 가지고 한 연산식으로 홀짝을 출력
		oddSum = 0 ; evenSum = 0 ;
		for(num=1;num<11;num++){
			if(num%2 == 0){
				evenSum += num ;
			}else{
				oddSum += num ;
			}
		}scanner.close();
		/* 		for(num=1;num<11;num++){
			if(num%2 == 0){
				evenSum += num ;
			}if(num%2 == 1){
				oddSum += num ;
			}
		}*/
		}
}
