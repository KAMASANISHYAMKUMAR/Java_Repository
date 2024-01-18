package java_programming;
import java.util.Scanner;
public class PerfectSquareNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lastnumber");
		int m=sc.nextInt();
		for(int i=1;i<=m;i++) {
			boolean status=false;
			int temp=i;
			for(int j=1;j<=i;j++) {
				if(j*j==temp) {
					status=true;
					break;
				}
			}
			if(status) {
				System.out.println("Perfect Square Numbers are :"+i);
				sc.close();
			}
		}

	}

}
