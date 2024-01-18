package java_programming;

import java.util.Scanner;

public class Non_prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range: ");
		int num = sc.nextInt();
		int sum=1;
		for(int i=1;i<=num;i++) {
			System.out.println(sum);
			sum+=i;
		}
		sc.close();

	}

}
