import java.util.Scanner;

public class bacnhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coefficients for the linear equation
        System.out.print("Nguyen Nhat Minh - 20225886 - a (a != 0): ");
        double a = scanner.nextDouble();
        System.out.print("Nguyen Nhat Minh - 20225886 - b: ");
        double b = scanner.nextDouble();

        // Check if a is zero
        if (a == 0) {
            System.out.println("Nguyen Nhat Minh - 20225886 - a != 0.");
        } else {
            // Calculate the solution
            double x = -b / a;
            System.out.println("Nguyen Nhat Minh - 20225886 - x = " + x);
        }

        scanner.close();
    }
}