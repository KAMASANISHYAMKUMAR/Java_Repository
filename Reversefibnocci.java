package java_programming;

public class Reversefibnocci {

	public static void main(String[] args) {
		int a=0,b=1,c=0;
		for(int i=1;i<10;i++) {
			a=b;
			b=c;
			c=a+b;
		}
		for(int i=1;i<=10;i++) {
			System.out.print(c+" ");
			c=b;
			b=a;
			a=c-b;
		}

	}

}
