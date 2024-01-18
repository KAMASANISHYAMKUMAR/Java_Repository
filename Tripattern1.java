/*

****
***
**
*
**
***
****

*/
package java_programming;
import java.util.Scanner;
public class Tripattern1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows");
		int rows=sc.nextInt();
		System.out.println("Enter star value");
		int star=sc.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int a=1;a<=star;a++) {
				System.out.print("*");
			}
			if(i<4) {
				star--;
			}else {
				star++;				
			}
			System.out.println();
			sc.close();
		}
	}
}
