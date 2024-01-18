package java_programming;
import java.util.Scanner;
public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter LastNumber :");
		int m=sc.nextInt();
		for(int i=1;i<=m;i++) {
			int temp=i,sum=0;
			while(temp!=0) {
				int lastdigit=temp%10;
				int fact=1;
				for(int j=lastdigit;j>=1;j--) {
					fact*=j;
				}
				sum+=fact;
				temp/=10;
			}
			if(sum==i) {
				System.out.println("Strong Number are :"+i);
				sc.close();
			}
		}

	}

}
