package java_programming;
import java.util.Scanner;
public class NonFibnocci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lastNumber");
		int m=sc.nextInt();
		int a=0,b=1,c=0;
		for(int i=0;i<=m;i++) {
			if(i!=c) {
				System.out.print(i+" ");
				sc.close();
			}else {
				c=a+b;
				a=b;
				b=c;
			}
		}
	}
}
// 4 6 7 9 10 

