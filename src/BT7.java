import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        System.out.println("Nhap so tu nhien: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        List<Number> listNumberUC = new ArrayList();
        for(int i = 1; i<= number;i++){
            if(number % i == 0){
                listNumberUC.add(i);
            }
        }
        System.out.println("Result: " + listNumberUC);
    }
}
