import java.util.Scanner;

public class BT19 {
    public static void main(String[] args) {
        System.out.println("Chon 1: giai phuong trinh bac 1 - Chon 2 giai phuong trinh bac 2");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number){
            case 1:{
                GiaiPhuongTrinhBac1();
                break;
            }
            case 2:{
                GiaiPhuongTrinhBac2();
                break;
            }
            default: {
                System.out.println("Ban nhap khong dung yeu");
                break;
            }
        }
    }

    public static void GiaiPhuongTrinhBac1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a - a phai khac 0:");
        int a;
        do {
            a = scanner.nextInt();
            if(a == 0){
                System.out.println(" a phai khac 0");
            }
        }while (a == 0);
        System.out.println("Nhap b: ");
        int b = scanner.nextInt();
        System.out.println("Nghiem thu duoc: " + (float) (-b)/a);
    }

    public static void GiaiPhuongTrinhBac2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a - a phai khac 0:");
        int a;
        do {
            a = scanner.nextInt();
            if(a == 0){
                System.out.println(" a phai khac 0");
            }
        }while (a == 0);
        System.out.println("Nhap b: ");
        int b = scanner.nextInt();
        System.out.println("Nhap c: ");
        int c = scanner.nextInt();

        float detal = b*b - 4*a*c;
        if(detal < 0){
            System.out.println("Phuong trinh vo nghiem");
        }
        if(detal == 0){
            System.out.println("Phuong trinh cho ra nghiem kep: " + (float) (-b)/(2*a));
        }
        if(detal > 0){
            System.out.println("Phuong trinh cho ra 2 nghiem rieng biet");
            float x1 =(float) (-b + Math.sqrt(detal))/(2*a);
            float x2 =(float) (-b - Math.sqrt(detal))/(2*a);
            System.out.println("Nghiem 1: " + x1);
            System.out.println("Nghiem 2: " + x2);
        }
    }
}
