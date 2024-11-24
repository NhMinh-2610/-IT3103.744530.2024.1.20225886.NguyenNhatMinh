import java.util.Scanner;
public class hephuongtrinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nguyen Nhat Minh - 20225886 - a1, b1, c1 (a1x + b1y = c1): ");
        double a1 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        double c1 = scanner.nextDouble();
        System.out.print("Nguyen Nhat Minh - 20225886 - a2, b2, and c2 (a2x + b2y = c2): ");
        double a2 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        double c2 = scanner.nextDouble();

        double D = a1 * b2 - a2 * b1;
        double Dx = c1 * b2 - c2 * b1;
        double Dy = a1 * c2 - a2 * c1;

        if (D != 0) {
            double x = Dx / D;
            double y = Dy / D;
            System.out.println(" Nguyen Nhat Minh - 20225886 -x = " + x + ",Nguyen Nhat Minh - 20225886 - y = " + y);
        } else if (Dx == 0 && Dy == 0) {
            System.out.println("Nguyen Nhat Minh - 20225886 -The system has infinitely many solutions.");
        } else {
            System.out.println("Nguyen Nhat Minh - 20225886 -The system has no solution.");
        }

        scanner.close();
    }
}