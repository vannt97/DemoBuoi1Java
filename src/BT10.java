import java.util.Scanner;

public class BT10 {
    public static void main(String[] args) {
        System.out.println("nhap so tu nhien N: ");
        Scanner scaner = new Scanner(System.in);
        int number = scaner.nextInt();
        int result = 0;
        for(int i = 0; i<=number;i++){
            result += i;
        }

        System.out.println("result: " + result);
    }
}
