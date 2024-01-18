package java_programming;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lastnumber");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int temp=i,sum=0;
			for(int j=1;j<temp;j++) {
				if(temp%j==0) {
					sum+=j;
				}
			}
			if(sum==temp) {
				System.out.println("Perfect Number are :"+i);
				sc.close();
			}
		}

	}

}
