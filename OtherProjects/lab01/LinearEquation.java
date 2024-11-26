import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập hệ số a và b
        System.out.println("Nhập giá trị của a: ");
        double a = scanner.nextDouble();
        
        System.out.println("Nhập giá trị của b: ");
        double b = scanner.nextDouble();
        
        // Kiểm tra các trường hợp
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            }
            else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } 
        else {
            double x = - b / a;
            System.out.println("Nghiệm của phương trình là x = " + x);
        }
        
        scanner.close();
    }
}

