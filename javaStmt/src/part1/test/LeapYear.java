package part1.test;
/* Date : 6��16��
 * Author : ����
 * Story : �Է¹޴� �⵵�� ���� �������� �ƴ����� �Ǻ��ϴ� �ǵ� ���α׷�
 */
import java.util.Scanner;
public class LeapYear {
		public static void main(String[] args) {
			/* ������ 4�� ���� ���� 0 �̸� �����ϼ� �ִ�.
			 * �׷��� �ش� ������ 100���� ������ �������� ����̴�.
			 * ����̶� �ص� �ٽ� 400 ���� ������ ���� ������ �����̴�.
			 */
			System.out.println("�˰��� �ϴ� �⵵�� �Է��Ͻÿ�");
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			scanner.close();
			String msg = "";
			if (a%400==0) { //���͸� if������ ���ʴ�� ������� ���� �� ������ �Ǻ��ϸ鼭 �Ϻη� ���� �����ϴ� ����
								//���͸� ����� ������� ũ�� �ִ� �������� ���� �������� ����.
				msg = "�����Դϴ�.";
			}else if (a%100 == 0) {
				msg = "����Դϴ�.";
			}else if (a%4 == 0) {
				msg = "�����Դϴ�.";
			}else{
				msg = "����Դϴ�.";
			}
			System.out.println(msg);
		}
}