package part1.whileloop;

public class SumTen {
	public static void main(String[] args) {
		// While �� 1~10���� ��
		int num=0 ; 
		int hap = 0 ;
		while(num<11){
			hap += num ;
			num++ ;
		}
		System.out.println("While ��\n1���� 10������ �� = " + hap);
		// Do ~ While �� 1~10���� ��
		int count = 1;
		int sum = 0 ;
		do {
			sum += count ;
			count++ ;
		}while(count<11);
		System.out.println("\nDo ~ While ��\n1���� 10���� �� =" + sum );
		// For - Loop �� 1~15���� ��
		int total = 0;
		for(int i = 0;i <= 15 ; i++){
			total += i ;
		}
		System.out.println("\nFor ��\n1���� 15���� �� =" + total );
		}
}
