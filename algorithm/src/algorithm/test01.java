package algorithm;

import java.util.Scanner;

import java.lang.*;

public class test01 {
	   public static void main(String[] args) {
	      // �� ���� �ִ��� ���ϼ���.
		   //�̷��� ��������(���μ���)�� ���������� ����Ǵ� ������ ������(concatenation)��������Ѵ�.
		   //if������ ()�ȿ� �ִ� ���� �򰡰���� ���� ���α׷��� ���� �帧�� �����ϴ� if���� ����(selection)��������Ѵ�.
	      Scanner sc = new Scanner(System.in);

	      System.out.println("a�� �� �Է�"); int a = sc.nextInt();
	      System.out.println("b�� �� �Է�"); int b = sc.nextInt();
	      System.out.println("c�� �� �Է�"); int c = sc.nextInt();
	      
	      int max = a;
	      if(b>max) max=b;
	      if(c>max) max=c;
	      
	      System.out.println("�ִ��� "+max+"��");
	      
	   }
}
