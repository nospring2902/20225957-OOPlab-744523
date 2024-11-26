import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập chiều cao tam giác
        System.out.print("Nhập chiều cao của tam giác: ");
        int n = scanner.nextInt();
        
        // In tam giác cân
        for (int i = 1; i <= n; i++) {
            // In khoảng trắng (dùng để canh giữa tam giác)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // In các dấu sao (*) cho mỗi hàng
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Xuống dòng sau mỗi hàng
            System.out.println();
        }
        
        scanner.close();
    }
}
