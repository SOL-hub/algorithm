package algorithm;

import java.util.Scanner;

public class test06 {
static int med3 (int a , int b , int c) {
	if((b >=a && c<=a)||(b<=a && c >= a )) // a= 1, b = 2, c = 3 // 2>1  or 3<=1 ||
	return a;
	
	else if ((a>b && c<b) || (a < b && c > b))
return b;
return c;
}

public static void main(String[] args) {
	System.out.println("중앙값을 구하시오");
	Scanner sc = new Scanner(System.in);
	
}
}
