import java.util.Scanner;

public class EmployeeBonusArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0, totalOld = 0, totalNew = 0;

        // Input with validation
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter years of service: ");
            years[i] = sc.nextDouble();

            if (salary[i] <= 0 || years[i] < 0) {
                System.out.println("Invalid input. Re-enter.");
                i--; // retry same index
                continue;
            }
        }

        // Calculation
        for (int i = 0; i < 10; i++) {
            if (years[i] > 5)
                bonus[i] = 0.05 * salary[i];
            else
                bonus[i] = 0.02 * salary[i];

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOld += salary[i];
            totalNew += newSalary[i];
        }

        // Output
        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOld);
        System.out.println("Total New Salary = " + totalNew);

        sc.close();
    }
}