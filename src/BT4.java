import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        System.out.println("Nhap 1 so tu nhien: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        long total = 0;
        for (int i = 1; i <= number;i++){
                total += i;
        }
        System.out.println("Result: " + total);
    }
}
