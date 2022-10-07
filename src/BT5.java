import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        System.out.println("Nhap toa do diem A:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("X: ");
        float coordinatesX_A = scanner.nextFloat();
        System.out.print("Y: ");
        float coordinatesY_A = scanner.nextFloat();

        System.out.println("Nhap toa do diem B:");
        System.out.print("X: ");
        float coordinatesX_B = scanner.nextFloat();
        System.out.print("Y: ");
        float coordinatesY_B = scanner.nextFloat();

        double result = Math.sqrt(Math.pow((coordinatesX_B - coordinatesX_A),2) + Math.pow((coordinatesY_B-coordinatesY_A),2));
        System.out.println("Result: " + result);
    }
}
