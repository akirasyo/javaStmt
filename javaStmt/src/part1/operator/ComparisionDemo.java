package part1.operator;

public class ComparisionDemo {
	public static void main(String[] args) {
		int val01 = 1, val02 = 2;
		/* if (){}   if�� �񱳹�,
	  	() �񱳽��� ��ġ�ϴ� �����,
	  	{} ���ǹ� �ٵ� ��� �θ���. */
		if(val01 == val02){  //val01 �� val02�� ���� ���ٸ� ...
			System.out.println("val01 �� val02 �� ���� �����ϴ�.");
		}
		else if(val01 != val02){	 //val01 �� val02 �� ���� �ٸ��ٸ�
			
			System.out.println("val01 �� val02 �� ���� �ٸ��ϴ�.");
		}
		else if(val01 > val02){
			System.out.println("val01 �� val02 ���� Ů�ϴ�.");
		}
		if(val01 < val02){
			System.out.println("val01 �� val02 ���� �۽��ϴ�.");
		}
	}
}
