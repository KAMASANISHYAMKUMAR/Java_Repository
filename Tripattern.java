package java_programming;
import java.util.Scanner;
/*

*           *
* *       * *
* * *   * * *
* * * * * * *

*/
public class Tripattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows");
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=7;j++) {
				if(j<=i||j>=8-i) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
			sc.close();
		}
	}
}