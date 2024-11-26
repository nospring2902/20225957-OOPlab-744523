import javax.swing.JOptionPane;

public class Calculate {
    public static void main (String[] args) {
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ");
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ");

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        
        JOptionPane.showMessageDialog(null,"Sum: " + sum);
        JOptionPane.showMessageDialog(null,"Difference: " + difference);
        JOptionPane.showMessageDialog(null,"Product: " + product);
        
        if (num2 != 0) {
        	double quotient = num1 / num2;
        	JOptionPane.showMessageDialog(null,"Quotient: " + quotient);
        }
        else {
        	JOptionPane.showMessageDialog(null,"Division by zero is undefined");
        }
    }
}
