package java_programming;
import java.util.Scanner;
/*

2                3
5 7          11 13
17 19 23    29 31 37
41 43 47 53 59 61 67

*/
public class DoubleTriPatternPrime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rows");
		int rows=sc.nextInt();
		System.out.println("Enter Columns");
		int col=sc.nextInt();
		int num=0,count=0;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=col;j++) {
				if(j<=i||j>=rows*2-i) {
//					System.out.print(" *");
					
					for(int b=num+1;b<=10000;b++){
						count=0;
						num=b;
						for(int c=1;c<=b;c++){
							if(b%c==0){
								count++;
							}
						}
						if(count==2){
							System.out.print(" "+b);
							break;
						}
					}
				}else {
					System.out.print("   ");
				}
			}
			System.out.println();
			sc.close();
		}
	}
}
