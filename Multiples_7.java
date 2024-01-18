package java_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Multiples_7 {

	public static void main(String[] args) {
		List<Integer> divisiors = Arrays.asList(1,2,3,4,5,6);
		
		List<Integer> firstMultiple = new ArrayList<Integer>();
		for (int divisior : divisiors) {
			firstMultiple.add(7 - (divisior%7));
		}
		List<Integer> secondMultiple = new ArrayList<Integer>();
		for (int multiple : firstMultiple) {
			secondMultiple.add(7+multiple);
		}
		List<Integer> fourthMultiple = new ArrayList<Integer>();
		for (int multiple : firstMultiple) {
			fourthMultiple.add(21+multiple);
		}
		
		System.out.println(firstMultiple);
		System.out.println(secondMultiple);
		System.out.println(fourthMultiple);
		
	}

}
