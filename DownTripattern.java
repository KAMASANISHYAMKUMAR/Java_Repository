package java_programming;
/*

* * * * * 
 * * * * 
  * * * 
   * * 
    * 
*/
public class DownTripattern {

	public static void main(String[] args) {
		int rows=5;
		for(int i=rows;i>=1;i--) {
			for(int space=1;space<=rows-i;space++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
