package part1.test;
import java.util.Scanner;

public class Notice {
	public static void main(String[] args) {
		int kor = 0 , eng = 0 , math = 0 , sum = 0 ; // ���������� �ʱ�ȭ �ʼ�
		double avg = 0.00d; // �Ǽ���(�Ҽ���) Ÿ���� ����Ÿ������ �ʱ�ȭ
		String msg = "" ; // String Ÿ���� ���ͷ��߿��� null �� �ʱ�ȭ
		// ��ĳ�ʷ� ������ �Է��ϸ� �հ迡 ���� �հݿ��θ� �����ϴ� ���α׷�
		// ���ǿ� ���� ������� ���� ������ �޶���
		// ��� 100���̸� ���ʽ� ����
		// ��� 70 �̻��̸� �հ�
		// ��� 70 �̸��̸� ���հ�
		Scanner scanner = new Scanner(System.in);
		System.out.print("���������� �Է��Ͻÿ� : ");
		kor = scanner.nextInt();
		System.out.print("���������� �Է��Ͻÿ� : ");
		eng = scanner.nextInt();
		System.out.print("���������� �Է��Ͻÿ� : ");
		math = scanner.nextInt();
		scanner.close();
		sum = kor + eng + math ;
		avg = sum / 3d ;
		
		if(avg >=70){
			msg = "�հ�";
			//System.out.println("�հ������� "+ avg + "�Դϴ�.");
			System.out.println(msg);
		}else{
			msg = "���հ�";
			//System.out.println("���հ��� "+ avg + "�Դϴ�.");
			System.out.println(msg);
		}
		if(avg == 100){
			msg =" ���ʽ� ����";
			System.out.println(msg);
		}
	}
}