package part1.whileloop;

import java.util.Scanner;

public class OddEvenSum {
	public static void main(String[] args) {
		int num = 1, sum = 0, oddSum = 0, evenSum = 0 ; // ���������� �ʱ�ȭ �ʼ�
		Scanner scanner = new Scanner(System.in);
		while(num<=10){
			sum += num; 
			num ++ ;
		}
		System.out.println(sum);
		// ���� while���� for������ ����
		sum = 0 ;
		for(num =1 ; num<= 10 ; num ++){
			sum += num ;
		}
		System.out.println(sum);
		// While ������ Ȧ��, ¦���� �� 
		num = 1 ; 
		while(num <= 10){
			oddSum += num ;
			num += 2 ;
		}
		System.out.println("Ȧ���� �� : " + oddSum);
		for(num = 0 ; num <=10 ; num+=2){
			evenSum += num ;
		}
		System.out.println("¦���� �� : " + evenSum);
		// For + if ���� ������ �� ��������� Ȧ¦�� ���
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
