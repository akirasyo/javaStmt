package part1.test;
import java.util.Scanner;
public class ManOrWoman2 {
	public static void main(String[] args) {
		System.out.println("�ֹι�ȣ�� �Է��ϼ���. (��)123456-4123456");
		Scanner scanner = new Scanner(System.in);
		String ssn = "", msg = "" ; // int �� �ʱ�ȭ�� 0, String �ʱ�ȭ�� ""
		ssn = "��ĳ�ʰ� �Է��� ���� �޵��� �ϼ���";
		/* int Ÿ���� �������� nextInt()
		 * String Ÿ���� �������� next() �� �����ϼ���.
		 */
		ssn = scanner.next();
		scanner.close();
		char ch = ssn.charAt(7); // ������ �ε������� 0 ��� ��ġ�ϼ���.
		/* �������� ���������� �Ǻ��ϴ� �κ��� �������� - ���� ������ 4�� �ش��մϴ�.
		 * ��Ʈ�� ���ڿ��� �������� �ε������ �ϴµ�..
		 * 0���� ���� �մϴ�.
		 * ����, �������� �ε���0 ���� 1�̰� �ε���1 ���� 2 �Դϴ�.
		 */
		/*if(ch == '1'|| ch == '3'){ // char Ÿ���� ' ' �̰�, String Ÿ���� " " !!!!����!!!!
			System.out.println("����");
		// ���� ��ºκ��� ���� ���� ���� ��ºκ��� 2�� 4�� ����, 5�� 6�� �ܱ���..
		// ������ ���� �߸��� �Է°��Դϴ�.��� ������ּ���.
		}else if(ch == '2' || ch == '4'){
			System.out.println("����");
		}else if(ch == '5' || ch == '6'){
			System.out.println("�ܱ���");
		}else{
			System.out.println("�߸��� �Է°��Դϴ�.");
		}*/
		// ����� .. ������ ���ϴ� ���� ������ ���� ��� �׽�Ʈ���� ����غ��� ���
		//System.out.println("ch : " + ch);
		switch (ch) {	
		case '1': case '3': msg = "����";		break;
		case '2': case '4': msg = "����";		break;
		case '5': case '6': msg = "�ܱ���";	break;
		default: msg = "�߸��� ��";			break;
		}
		System.out.println(msg);
	}
}
	