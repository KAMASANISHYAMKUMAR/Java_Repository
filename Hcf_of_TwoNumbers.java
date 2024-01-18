package java_programming;
import java.util.Scanner;
public class Hcf_of_TwoNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers one after one");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int hcf=0;
		for(int i=1;i<=num1&&i<=num2;i++) {
			if(num1%i==0&&num2%i==0) {
				hcf=i;
			}
		}
		System.out.println("Hcf of Given Two numbers are :"+hcf);
		sc.close();
	}

}

/*for more than 2 number we have write 
the more number of conditions in for loop and if condition */