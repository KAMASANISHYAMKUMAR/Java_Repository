
package java_programming;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lastnumber");
		int m=sc.nextInt();
		for(int i=1;i<=m;i++) {
			int temp=i,count=0;
			while(temp!=0) {
				count++;
				temp/=10;
			}
			int temp1=i,sum=0;
			while(temp1!=0) {
				int ld=temp1%10;
				int product=1;
				for(int j=1;j<=count;j++) {
					product*=ld;
				}
				sum+=product;
				temp1/=10;
			}
			if(sum==i) {
				System.out.println("Armstrong number are :"+sum);
				sc.close();
			}
		}

	}

}
