import javax.swing.JOptionPane;

public class NumberOperations {
    public static void main(String[] args) {
        String input1, input2;
        String message = "You have entered: ";

        input1 = JOptionPane.showInputDialog(null, "Enter the first number:", "Input First Number", JOptionPane.QUESTION_MESSAGE);
        message += input1 + " and ";

        input2 = JOptionPane.showInputDialog(null, "Enter the second number:", "Input Second Number", JOptionPane.QUESTION_MESSAGE);
        message += input2;

        double firstNumber = Double.parseDouble(input1);
        double secondNumber = Double.parseDouble(input2);

        double sum = firstNumber + secondNumber;
        double diff = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;
        int quotient = (int) (firstNumber / secondNumber);
        int remainder = (int) (firstNumber % secondNumber);

        JOptionPane.showMessageDialog(null, message);
        JOptionPane.showMessageDialog(null, "The sum is: " + sum);
        JOptionPane.showMessageDialog(null, "The difference is: " + diff);
        JOptionPane.showMessageDialog(null, "The product is: " + product);
        JOptionPane.showMessageDialog(null, "The quotient is: " + quotient);
        JOptionPane.showMessageDialog(null, "The remainder is: " + remainder);

        System.exit(0);
    }
}
