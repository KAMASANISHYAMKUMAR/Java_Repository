
package java_programming;
 
public class SuperWheelSales {
 
    public static void main(String[] args) {
 
        // Months and their days
        String[] months = {"April", "May", "June", "July", "August", "September"};
        int[] days = {30, 31, 30, 31, 31, 30};
 
        for (int i = 0; i <= months.length-1; i++) {
            int totalSales = 0;
            int currentDaySales = 1;
 
            for (int j = 1; j <= days[i]; j++) {
                if (j % 5 == 0) {
                    continue;
                }
//                System.out.println(months[i] + ": " + currentDaySales);
                totalSales += currentDaySales;
                	currentDaySales += j*2;
            }
 
            System.out.println(months[i] + ": " + totalSales);
        }
    }
}