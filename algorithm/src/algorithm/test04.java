package algorithm;

public class test04 {
//�� ���� �ּڰ��� ���ϴ� min4�޼��带 �ۼ��ϼ���.
	static int min4(int a , int b , int c, int d) {
		
		int min = a;
		
		if(min>b) min = b;
		if(min>c) min = c;
		if(min>d) min = d;
		
		return min;
	}
	public static void main(String[] args) {
		System.out.println(min4(13, 6, 5, 7));
		
		
	}
}
