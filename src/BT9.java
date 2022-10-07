import java.util.Scanner;

public class BT9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        int number1;
        int number2;
        do{
            System.out.println("Nhap so tu nhien thu nhat: ");
            number1 = scanner.nextInt();
            System.out.println("Nhap so tu nhien thu hai: ");
            number2 = scanner.nextInt();
            if((number1 <10 || number1 > 99)|| (number2 < 10 || number2 > 99)){
                System.out.println("Nhap sai roi - phai la tu 10-99 nha");
            }else{
                isValid = true;
            }
        }while (!isValid);

        while (number1!=0){
            int unit1 = number1%10;
            int number2Ex = number2;
            while (number2Ex != 0){
                int unit2 = number2Ex%10;
                if(unit1 == unit2){
                    System.out.println("True");
                    return;
                }
                number2Ex = number2Ex / 10;
            }
            number1 = number1 /10;
        }
        System.out.println("False");
    }
}
