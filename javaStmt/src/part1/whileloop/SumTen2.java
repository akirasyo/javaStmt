package part1.whileloop;

public class SumTen2 {
	public static void main(String[] args) {
		// While �� 1~10���� ��
		int num = 0, sum =0 ; // => For ���� �ʱⰪ ������ ��ġ
		while (num<=10) { // => �Ѱ谪 ����, For ���� ����Ʈ���� ��ġ
			sum += num ; // => sum = sum + num �� ��๮
			num ++; // num = num +1 �� ��๮       ������ ���� -> For ���� �����İ� ��ġ
		}
		System.out.println(sum);
		// Do - While �� 1���� 10���� ��
		int num2 = 0 , sum2 = 0; // => �ʱⰪ ����
		do {
			 sum2 += num2 ;
			 num2 ++ ; // => ������ ����
		} while (num2<=10); //=> �Ѱ谪 ����
		System.out.println(sum2);
		// For �� 1���� 10���� ��
		int sum3 = 0 ;
		for(int num3 =0 ;num3<=10;num3++){
			sum3 += num3;
		}
		System.out.println(sum3);
	}
}
