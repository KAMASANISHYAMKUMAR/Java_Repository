package java_programming;

public class Multiples {

	public static void main(String[] args) {
		int k = 0;
		int i=7;
		while ( k< 5 && i >= 7) {
		if ((i%1==1)&&(i % 2 == 1) && (i % 3 == 1) && (i % 4 == 1) && (i % 5 == 1) && (i % 6 == 1)) {
		k++;
		if(k<3 ||k==4){
		System.out.println(k + " "+"Number " + i);
		}
		}
		i+=7;

		}
		

	}

}
