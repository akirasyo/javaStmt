package part1.operator;

public class ComparisionDemo2 {
	public static void main(String[] args) {
		int val01 = 1, val02 = 2;
		/* ������ if ���� �Ѱ��� �������� ���ľ� �� �����, 
		   if else ������ ����Ѵ�.
		 */
		if(val01 == val02){
			System.out.println("val01 �� val02 �� ���� �����ϴ�.");
		}
		else if(val01 != val02){
			System.out.println("val01 �� val02 �� ���� �ٸ��ϴ�.");
		}
		else if(val01 > val02){
			System.out.println("val01 �� val02 ���� Ů�ϴ�.");
		}
		else if(val01 < val02){
			System.out.println("val01 �� val02 ���� �۽��ϴ�.");
		}
	}
}
