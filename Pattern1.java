/*
	     1 
   	   2 3 2 
     3 4 5 4 3 
   4 5 6 7 6 5 4 
 5 6 7 8 9 8 7 6 5 */

package java_programming;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows ");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int space=rows-i;space>=1;space--) {
				System.out.print("  ");
			}
			int temp=i;
			for(int j=1;j<=i;j++) {
				System.out.print(temp+" ");
				temp+=1;
			}
			temp-=2;
			for(int k=i-1;k>=1;k--) {
				System.out.print(temp+" ");
				temp-=1;
			}
			System.out.println();
			sc.close();
		}
	}

}

