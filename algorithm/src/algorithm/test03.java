package algorithm;

public class test03 {
//세 값의 최솟값을 구하는 min3메서드를 작성하세요.
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
