package algorithm;

public class test03 {
//�� ���� �ּڰ��� ���ϴ� min3�޼��带 �ۼ��ϼ���.
	static int min3(int a, int b, int c) {
		
	int min = a;
	if(min>b)min=b;
	if(min>c)min=c;
	return min;
		
	}
	public static void main(String[] args) {
		System.out.println(min3(1, 5, 4));
	}
}
