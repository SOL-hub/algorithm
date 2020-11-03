package algorithm;

import java.util.Scanner;

import java.lang.*;

public class test01 {
	   public static void main(String[] args) {
	      // 세 값의 최댓값을 구하세요.
		   //이렇게 여러문장(프로세스)이 순차적으로 실행되는 구조를 순차적(concatenation)구조라고한다.
		   //if문쪽의 ()안에 있는 식의 평가결과에 따라 프로그램의 실행 흐름을 변경하는 if문을 선택(selection)구조라고한다.
	      Scanner sc = new Scanner(System.in);

	      System.out.println("a의 값 입력"); int a = sc.nextInt();
	      System.out.println("b의 값 입력"); int b = sc.nextInt();
	      System.out.println("c의 값 입력"); int c = sc.nextInt();
	      
	      int max = a;
	      if(b>max) max=b;
	      if(c>max) max=c;
	      
	      System.out.println("최댓값은 "+max+"임");
	      
	   }
}
