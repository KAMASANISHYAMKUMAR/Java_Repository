package java_programming;
import java.util.Scanner;
public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lastNumber");
		int m=sc.nextInt();
		for(int i=1;i<=m;i++) {
			int temp=i,sum=0,product=1;
			while(temp!=0) {
				int ld=temp%10;
				sum+=ld;
				product*=ld;
				temp/=10;
			}
			if(sum==product) {
				System.out.println("Spy number are :"+i);
				sc.close();
			}
		}

	}

}
