package part1.whileloop;

import java.util.Scanner;

/* @ 6.15
 * @Story : ���Ϸ��� ���ڸ� �Է��� �극��ũ ����� �δ� ����
 */
public class BreakDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���Ϸ��� �������� �Է��ϼ���");
		// ���ݱ����� ������ ������ ī��Ʈ �� ��ŭ�� �Է��ߴµ�
		// �������ʹ� �������� �������� �ο��մϴ�.
		System.out.println("���߽÷��� -1�� �Է��ϼ���");
		int num = 0, sum =0 ;
		while (true) { // while ������ condition �� true ��� �ָ�, ���ѷ��� ������ �ȴ�.
			num = scanner.nextInt();
			if (num == -1 ) {
				break; // -1 �� �ԷµǸ� �ݺ��� �����Ѵ�.
			}
			sum += num ;
		}
		scanner.close();
		System.out.println(sum);
	}
}
