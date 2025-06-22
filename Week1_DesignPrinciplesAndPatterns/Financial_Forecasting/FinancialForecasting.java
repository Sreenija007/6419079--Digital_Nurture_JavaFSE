import java.util.Scanner;
public class FinancialForecasting {

    public static double futureValue(double presentValue, double rate, int periods) {
        double futureValue = presentValue;
        for (int i = 0; i < periods; i++) {
            futureValue = futureValue * (1 + rate);  //  growth rate each period
        }
        return futureValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter present value: ");
        double presentValue = sc.nextDouble();

        System.out.print("Enter growth rate (in %): ");
        double rate = sc.nextDouble() / 100;  // Convert to decimal

        System.out.print("Enter number of periods: ");
        int periods = sc.nextInt();

        double predictedValue = futureValue(presentValue, rate, periods);

        System.out.println(
            "Predicted future value after " + periods + " periods: " + predictedValue
        );

        sc.close();
    }
}
