package java_programming;
/*
		* 
      * * 
    * * * 
  * * * * 
* * * * * 

*/
public class LeftTriPattern {

	public static void main(String[] args) {
		int rows=5;
		for(int i=1;i<=rows;i++) {
			for(int space=2*(rows-i);space>=1;space--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
