import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BT20 {
    public static void main(String[] args) {

        List<Integer> listNumber = new ArrayList<Integer>();
        System.out.println("Nhap so phan tu mang:");
        Scanner scanner = new Scanner(System.in);
        int lengthList = scanner.nextInt();
        for(int i = 0; i < lengthList; i++){
            System.out.println("Nhap phan tu thu " + i + ":");
            listNumber.add(scanner.nextInt());
        }

        List<Integer> listNumberEven = new ArrayList<>();
        List<Integer> listNumberOdd = new ArrayList<>();

        for(int value: listNumber){
                if(value%2 == 0){
                    listNumberEven.add(value);

                }else {
                    listNumberOdd.add(value);
                }
        }
        System.out.println("Mang chua loc: " + listNumber);
        System.out.println("Mang chan: " +listNumberEven);
        System.out.println("Mang le: " + listNumberOdd);

    }
}
