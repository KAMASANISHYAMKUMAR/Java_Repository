package java_programming;

public class VehicleSales {

    public static void main(String[] args) {
        int[] daysInMonth = {30, 31, 30, 31, 31, 30}; // Days in April, May, June, July, August, September

        int totalVehiclesSold = 0;

        for (int month = 0; month < 6; month++) {
            int vehiclesSold = calculateVehiclesSold(daysInMonth[month]);
            totalVehiclesSold += vehiclesSold;

            System.out.println("Month " + (month + 4) + ": " + vehiclesSold + " vehicles sold");
        }

        System.out.println("Total vehicles sold from April to September: " + totalVehiclesSold);
    }

    private static int calculateVehiclesSold(int daysInMonth) {
        int vehiclesSold = 0;
        int retailDays = 4;
        int corporateDays = 1;

        for (int day = 1; day <= daysInMonth; day++) {
            if (corporateDays == 5) {
                // Exclusive corporate day
                vehiclesSold += 21;
                corporateDays = 1; // Reset corporate day counter
            } else {
                // Retail day
                vehiclesSold += calculateRetailSale(day);
                retailDays--;
            }

            // Check if retail cycle is completed
            if (retailDays == 0) {
                retailDays = 4; // Reset retail day counter
                corporateDays++;
            }
        }

        return vehiclesSold;
    }

    private static int calculateRetailSale(int day) {
        // Calculate retail sales based on the provided pattern
        return 1 + 2 * (day - 1);
    }
}
