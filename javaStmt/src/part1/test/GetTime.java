package part1.test;

import java.util.Scanner;

public class GetTime {
	public static void main(String[] args) {
		/*
		int time = 5000; // 초
		int second = 0 , minute = 0 , hour = 0 ;
		second = time % 60; // 500을 60으로 나눈 나머지는 초
		minute = (time/60) % 60 ; // 500초를 60으로 나눈 몫을 다시 60으로 나눈 나머지는 분
		hour = ((time/60)/60) % 60 ;
		System.out.println(hour + "시" + minute + "분" + second + "초");
		 */
		System.out.println("계산하고 싶은 초를 입력하시오");
		Scanner scanner = new Scanner(System.in);
		long time = scanner.nextLong();
		//int time = 5000; // 초
		long second = 0 , minute = 0 , hour = 0 ;
		second = time % 60; // 500을 60으로 나눈 나머지는 초
		minute = (time/60) % 60 ; // 500초를 60으로 나눈 몫을 다시 60으로 나눈 나머지는 분
		hour = (time/60)/60 ;
		scanner.close();
		System.out.println(hour + "시" + minute + "분" + second + "초");
	}
}
