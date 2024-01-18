package java_programming;
import java.util.Scanner;
public class PascalPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rows ");
		int rows=sc.nextInt();
		for(int i=0;i<=rows;i++) {
			for(int space=rows-i;space>=1;space--) {
				System.out.print(" ");
			}
			int t=1;
			for(int j=0;j<=i;j++) {
				if(j==0||i==j) {
					t=1;
				}else {
					t=t*(i-j+1)/j;
				}
				System.out.print(t+" ");
			}
			System.out.println();
			sc.close();
		}
	}

}
