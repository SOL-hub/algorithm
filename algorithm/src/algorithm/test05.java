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
	
	System.out.println("세 정수의 중앙값을 구합니다");
	System.out.println("a의 값");
	int a = sc.nextInt();
	System.out.println("b의 값");
	int b = sc.nextInt();
	System.out.println("c의 값");
	int c = sc.nextInt();
	
	System.out.println("중앙값은" + med3(a, b, c)+ "입니다");
}
}
