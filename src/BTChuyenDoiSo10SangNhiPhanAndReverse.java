import java.util.Scanner;

public class BTChuyenDoiSo10SangNhiPhanAndReverse {
    public static void main(String[] args) {
        System.out.println("Nhap so He co so 10: ");
        Scanner scanner = new Scanner(System.in);
        long number;
        do{
            number = scanner.nextInt();
            if(number <= 0){
                System.out.println("Nhap so lon hon 0");
            }
        }while (number<=0);

        long binary=0;
        long unit = 1;
        while (number != 0){
            binary += (number%2)*unit;
            number = number /2;
            unit = unit * 10;
        }
        System.out.println("So co he so 2: " + binary);
        System.out.println("Ban co muon dao nguoc lai khong - chon lon hon 0 la co ");

        int isContinue;
        do{
            isContinue = scanner.nextInt();
            if(isContinue < 0){
                System.out.println("Nhap khong dung cu phap");
            }
        }while(isContinue<0);

        long dec = 0;
        long unitDec = 0;
        while(binary!=0){
            dec = (long) (dec + (binary%10)*Math.pow(2,unitDec));
            binary =binary/10;
            unitDec += 1;
        }

        System.out.println("He co so 10: " + dec);


    }
}
