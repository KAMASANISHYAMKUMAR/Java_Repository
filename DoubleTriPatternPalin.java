package java_programming;
import java.util.Scanner;
/*
1 2 3 4 5 6 7
8 9 11   22 33 44
55 66       77 88
99           101  */
public class DoubleTriPatternPalin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rows");
		int rows=sc.nextInt();
		System.out.println("Enter Columns");
		int col=sc.nextInt();
		int num=0;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=col;j++) {
				if(j<=rows+1-i||j>=rows-1+i) {
					for(int x=num+1;x<=10000;x++) {
						int temp=x,rev=0;
						num=x;
						while(temp!=0) {
							int ld=temp%10;
							rev=rev*10+ld;
							temp/=10;
						}
						if(rev==x) {
							System.out.print(" "+x);
							break;
						}
					}
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
			sc.close();
		}
	}

}
