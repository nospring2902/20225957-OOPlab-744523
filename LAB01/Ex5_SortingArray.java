import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args){
        int n;

        System.out.println("Enter number of elements: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Elements: ");
        for (int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        Arrays.sort(a);
        for (int i=0;i<n;i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
