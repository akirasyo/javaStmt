package part1.array;
public class StringArrayDemo {
	public static void main(String[] args) {
		String[] arr ; // String Ÿ���� �迭 ����
		arr = new String[3]; // 3ó�� �׻� �ε��� ����� �Է��ؾ� ��
		arr[0] = "1";
		arr[1] = "2";
		arr[2] = "3";
		arr[3] = "4" ;
		/*
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
			at part1.array.StringArrayDemo.main(StringArrayDemo.java:11)
		���� �����޽����� �迭�� ũ�⸦ ��� ����
		 */
	}
}
