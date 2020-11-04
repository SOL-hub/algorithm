package algorithm;

class Max3m {
	static int Max3m(int a, int b, int c) {
	int max = a;
	if(b>max) max = b;
	if(c>max) max = c;
	
	return max;
	
	}
	public static void main(String[] args) {
		System.out.println("max3(3, 2, 1) = " + Max3m(3, 2, 1));
	}}


