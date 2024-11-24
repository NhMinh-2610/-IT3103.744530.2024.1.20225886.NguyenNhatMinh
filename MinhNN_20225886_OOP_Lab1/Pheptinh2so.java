import javax.swing.JOptionPane;

public class Pheptinh2so {
    public static void main(String[] args) {

        String strnum1 = JOptionPane.showInputDialog(null, "Nguyen Nhat Minh - 20225886 - number 1:");
        double num1 = Double.parseDouble(strnum1);

        // Input the second number from the user
        String strnum2 = JOptionPane.showInputDialog(null, "Nguyen Nhat Minh - 20225886 - number 2 :");
        double num2 = Double.parseDouble(strnum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        String quotientResult;
        if (num2 != 0) {
            double quotient = num1 / num2;
            quotientResult = "Nguyen Nhat Minh - 20225886 -Quotient: " + quotient;
        } else {
            quotientResult = "Nguyen Nhat Minh - 20225886 -Cannot divide by zero";
        }

        String result = "Nguyen Nhat Minh - 20225886 -Sum: " + sum + "\n" +
                        "Nguyen Nhat Minh - 20225886 -Difference: " + difference + "\n" +
                        "Nguyen Nhat Minh - 20225886 -Product: " + product + "\n" +
                        quotientResult;

        JOptionPane.showMessageDialog(null, result);
    }
}