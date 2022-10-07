import java.util.Scanner;

public class BT16 {
    public static void main(String[] args) {
        System.out.println("Nhap nam vao: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if(CheckYear(year)){
            System.out.println("la nam nhuan");
        }else {
            System.out.println("la nam khong nhuan");
        }
    }

    public static boolean CheckYear(int year){
        if(year % 400 == 0){
            return true;
        }
        if(year % 4 == 0 && year %100!= 0){
            return true;
        }
        return false;
    }
}
