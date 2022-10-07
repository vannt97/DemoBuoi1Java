import java.util.Scanner;

public class BT17 {
    public static void main(String[] args) {
        System.out.println("Nhap So Ban muon: ");
        Scanner scanner = new Scanner(System.in);
        int number;
        int numberFromBot = (int) (Math.random()*1000);
        do{
            number  = scanner.nextInt();
            if(number > numberFromBot){
                System.out.println("So cua ban nhap dang lon hon so cua may");
                continue;
            }
            if(number < numberFromBot){
                System.out.println("So cua ban nhap dang be hon so cua may");
                continue;
            }

        }while (number != numberFromBot);
        System.out.println("Ban nhap dung roi chuc mung ban!!!!!");
    }
}
