package part1.test;

import java.util.Scanner;

/*	6.15
 * 	Story : 
 */
public class Kaup {
	public void testMethod(){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Ű�� �Է��ϼ���");
	double height = scanner.nextDouble();
	System.out.println("�����Ը� �Է��ϼ���");
	double weight = scanner.nextDouble();
	scanner.close();
	// �Ʒ��� ���� double Ÿ���� ������� intŸ���� ������ �Ҵ��ؾ� �ϹǷ�
	// ĳ������ �Ͼ����, ���� ��Ŭ������ �����ϴ� �ڵ��ϼ� ������� �ذ��Ѵ�.
	int idx = (int) ((weight/(height*height))*10000) ;
	String msg = "";
	if (idx > 30) {
		msg= "��";
	}else if(idx > 24){
		msg = "��ü��";
	}else if(idx > 20){
		msg = "����";
	}else if(idx > 15){
		msg = "��ü��";
	}else if(idx > 13){
		msg = "����";
	}else if(idx > 10){
		msg = "�������";
	}else{
		msg = "�Ҹ���";
	}
	
	System.out.println("ī��������[Ű=" + height + " , ������=" + weight + " , ī��������=" + msg + "]");
	/* idx>24 ��ü��
	 * idx>20 ����
	 * idx>15 ��ü��
	 * idx>13 ����
	 * idx>10 �������
	 * �̵����� �ƴϸ� "�Ҹ���"
	 */
}
	public static void main(String[] args) {
	Kaup kaup = new Kaup();
	kaup.testMethod();
	}
}
