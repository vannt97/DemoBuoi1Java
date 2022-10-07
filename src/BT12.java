import java.util.Scanner;

public class BT12 {
    public static void main(String[] args) {
        System.out.println("Nhap so Tu nhien tu 0 - 9: ");
        Scanner scanner = new Scanner(System.in);
        int number ;
        do{
            number= scanner.nextInt();
            if(number < 1 || number > 9){
                            System.out.println("Ban nhap sai yeu cau");
            }
        }while (number < 1 || number > 9);
        for(int i = 1;i<=number;i++) {
            for ( int j = 1; j < i + 1; j++){
                System.out.print(j);
            };
            System.out.println();
        }
    }
}
