import java.util.Scanner;
public class ptbac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nguyen Nhat Minh - 20225886 - a, b, c (ax^2 + bx + c = 0): ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Nguyen Nhat Minh - 20225886 - x1 = " + root1 + ", Nguyen Nhat Minh - 20225886 - x2 = " + root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("Nguyen Nhat Minh - 20225886 - x = " + root);
        } else {
            System.out.println("Nguyen Nhat Minh - 20225886 - can't find x");
        }

        scanner.close();
    }
}