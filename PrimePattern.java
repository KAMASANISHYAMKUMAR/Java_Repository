package java_programming;

public class PrimePattern {

	public static void main(String[] args) {
		int rows=5,num=0,count;
		for(int i=1;i<=rows;i++) {
			for(int space=1;space<=rows-i;space++) {
				System.out.print(" ");
			}
			for(int row=1;row<=i;row++) {
			for(int j=num+1;j<=10000;j++) {
				count=0;
				num=j;
				for(int k=1;k<=j;k++) {
					if(j%k==0) {
						count++;
					}
				}
				if(count==2) {
					System.out.print(j+" ");
					break;
				}
			}
			}
			System.out.println();
		}
	}

}
