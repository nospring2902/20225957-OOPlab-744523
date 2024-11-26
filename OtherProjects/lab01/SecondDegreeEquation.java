import java.util.Scanner;

public class SecondDegreeEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập hệ số
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();
        
        // a = 0
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Vô số nghiệm");
                } 
                else {
                    System.out.println("Vô nghiệm");
                }
            } 
            else {
                double x = - c / b;
                System.out.println("Nghiệm duy nhất: x = " + x);
            }
        } 
        else {
            // Tính delta
            double delta = b * b - 4 * a * c;
            
            if (delta > 0) {
                // 2 nghiệm phân biệt
                double x1 = (- b + Math.sqrt(delta)) / (2 * a);
                double x2 = (- b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Hai nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } 
            else if (delta == 0) {
                // Nghiệm kép
                double x = - b / (2 * a);
                System.out.println("Nghiệm kép: x = " + x);
            } 
            else {
                // Vô nghiệm
                System.out.println("Vô nghiệm");
            }
        }
        scanner.close();
    }
}
