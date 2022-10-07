import java.util.Scanner;

public class BT15 {
    public static void main(String[] args) {
        System.out.println("Nhap 1 chuoi :");
        Scanner scanner = new Scanner(System.in);
        String chuoi = scanner.nextLine();
        System.out.println("Do dai cua Chuoi la: " + chuoi.length());

        System.out.println("Nhap index: ");
        int index ;
        do{
            index = scanner.nextInt();
            if(index >= chuoi.length()){
                System.out.println("Nhap trong pham vi cua chuoi nhe");
            }
        }while (index >= chuoi.length());
        System.out.println("Ky tu tai vi tri index " + index + ":" + chuoi.charAt(index));

        System.out.println("Kiem tra co chuoi phu 'abcdef' hay khong");
        if(chuoi.contains("abcdef")){
            System.out.println("co chuoi phu 'abcdef'");
        }else{
            System.out.println("Khong co chuoi phu");
        }

    }
}
