// In a hospital there are three areas: Gynecology, Pediatrics, traumatology
// ... The hospital's annual budget is distributed 40% Gynecology,30% Pediatrics, 30% Traumatology,
// Read the total budget and print the budget value by area.
       
import java.util.Scanner;

public class HospitalBudget {

    public static void main(String[] args) {

        // Read the total budget
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the hospital's total annual budget: ");
        double totalBudget = scanner.nextDouble();

        // Calculate the budget per area
        double gynecology = Math.round(totalBudget * 0.4 * 100) / 100.0;
        double pediatrics = Math.round(totalBudget * 0.3 * 100) / 100.0;
        double traumatology = Math.round(totalBudget * 0.3 * 100) / 100.0;

        // Print the budget per area
        System.out.println("Budget for Gynecology: " + gynecology);
        System.out.println("Budget for Pediatrics: " + pediatrics);
        System.out.println("Budget for Traumatology: " + traumatology);
    }
}
