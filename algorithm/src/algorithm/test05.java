package algorithm;

import java.util.Scanner;

public class test05 {
public static int med3(int a , int b , int c) {
	if(a>=b)
		if(b>=c)
			
			return b;   //a, b, f , g (a > b > c), (a> b =c), (a=b>c), 
		else if (a<=c)
			return a;   //d, e, h       
	
		else
			return c; //a> c> b 
	
	    else if(b > c)
		    return c;  //(b>a>c)
	
	    else 
	    	return b;
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("�� ������ �߾Ӱ��� ���մϴ�");
	System.out.println("a�� ��");
	int a = sc.nextInt();
	System.out.println("b�� ��");
	int b = sc.nextInt();
	System.out.println("c�� ��");
	int c = sc.nextInt();
	
	System.out.println("�߾Ӱ���" + med3(a, b, c)+ "�Դϴ�");
}
}
