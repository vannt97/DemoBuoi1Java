import java.util.Scanner;

public class BT21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 ;

        int x2,v1,v2 ;
        do{
            System.out.println("Nhap vi tri X1: ");
            x1 = scanner.nextInt();
            System.out.println("Nhap vi tri X2: ");
            x2 = scanner.nextInt();
            if(x2 > 10000 || x1 > x2 || x1 <0){
                System.out.println("Nhap khong dung dieu kien");
                continue;
            }


        }while (x2 > 10000 || x1 > x2 || x1 < 0 );

        do {
            System.out.println("Nhap van toc V1: ");
            v1 = scanner.nextInt();
            System.out.println("Nhap van toc V2: ");
            v2 = scanner.nextInt();
            if(v2 > 10000 || v1 <1){
                System.out.println("Nhap khong dung yeu cau");
                continue;
            }
        }while (v2 > 10000 || v1 < 1 || v2 <1);
        boolean isGapNhau = false;
        while (x1 < 10000 || x2 < 10000){
            x1 += v1;
            x2 += v2;
            if(x1 == x2){
                isGapNhau = true;
                break;
            }
        }

        if(isGapNhau){
            System.out.println("Co gap nhau");
        }else {
            System.out.println("Khong gap nhau");
        }

    }
}
