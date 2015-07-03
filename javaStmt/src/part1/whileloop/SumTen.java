package part1.whileloop;

public class SumTen {
	public static void main(String[] args) {
		// While 문 1~10까지 합
		int num=0 ; 
		int hap = 0 ;
		while(num<11){
			hap += num ;
			num++ ;
		}
		System.out.println("While 문\n1부터 10까지의 합 = " + hap);
		// Do ~ While 문 1~10까지 합
		int count = 1;
		int sum = 0 ;
		do {
			sum += count ;
			count++ ;
		}while(count<11);
		System.out.println("\nDo ~ While 문\n1부터 10까지 합 =" + sum );
		// For - Loop 문 1~15까지 합
		int total = 0;
		for(int i = 0;i <= 15 ; i++){
			total += i ;
		}
		System.out.println("\nFor 문\n1부터 15까지 합 =" + total );
		}
}
