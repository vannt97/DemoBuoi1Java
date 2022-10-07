import java.util.Scanner;

public class BT18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float  money;
        float futureMoney;
        float perBank = 0;
        do {
            System.out.println("Nhap so tien Anh X gui ngan hang: ");
            money = scanner.nextFloat();
            System.out.println("Nhap so tien Anh X muon co trong tuong lai: ");
            futureMoney = scanner.nextFloat();
            if(futureMoney < money){
                System.out.println("Tien mong muon trong tuong lai phai lon hon tien hien tai");
                continue;
            }
            System.out.println("Nhap lai xuat ngan hang: ");
            perBank = scanner.nextFloat();
        }while (futureMoney < money);
        float tienlai = futureMoney - money;
        float soNamCho = tienlai/((perBank/100)*money);
        System.out.println("So nam can cho " + soNamCho);

    }
}
