package java_programming;
import java.util.*;
public class SunnyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter last number");
		int m=sc.nextInt();
		for(int i=1;i<=m;i++) {
			int temp=i+1;
			boolean status=false;
			for(int j=1;j<temp;j++) {
				if(j*j==temp) {
					status=true;
					break;
				}
			}
			if(status) {
				System.out.println("Sunny Number are :"+i);
				sc.close();
			}
		}
	}
}
