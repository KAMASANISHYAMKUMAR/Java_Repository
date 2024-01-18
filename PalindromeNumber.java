package java_programming;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter LastNumber");
		int m=sc.nextInt();
		for(int i=1;i<=m;i++) {
			int temp=i,rev=0;
			while(temp!=0) {
				int lastdigit=temp%10;
				rev=rev*10+lastdigit;
				temp/=10;
			}
			if(rev==i) {
				System.out.println("Palindrome Numbers are :"+i);
				sc.close();
			}
		}

	}

}
