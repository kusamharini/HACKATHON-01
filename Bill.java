import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double waterConsumption = sc.nextDouble();

        if (waterConsumption <= 500) {
            System.out.println("Water Bill: Rs.100");
        } else {
            System.out.println("Water Bill: Rs.200");
        }

        sc.close();
    }
}