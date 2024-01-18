package java_programming;

public class FibonacciNumber {

	public static void main(String[] args) {
		int a=0,b=1,c=0;
		for(int i=1;i<=10;i++) {
			
			System.out.print(c+" ");
			c=a+b;
			a=b;
			b=c;
		}

	}

}
