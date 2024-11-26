import java.util.Scanner;

public class LinearSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập hệ số
        System.out.println("Nhập hệ số cho phương trình đầu tiên (a11, a12, b1): ");
        double a11 = scanner.nextDouble();
        double a12 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        
        System.out.println("Nhập hệ số cho phương trình thứ 2 (a21, a22, b2): ");
        double a21 = scanner.nextDouble();
        double a22 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        
        // Tính định thức
        double D = a11 * a22 - a12 * a21;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;
        
        // Tính kết quả dựa trên định thức
        if (D != 0) {
            // Nghiệm duy nhất
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("Hệ có nghiệm duy nhất:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } 
        else {
            // Vô nghiệm hoặc vô số nghiệm
            if (D1 == 0 && D2 == 0) {
                System.out.println("Hệ có vô số nghiệm");
            } 
            else {
                System.out.println("Hệ vô nghiệm");
            }
        }
        scanner.close();
    }
}

