import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BT14 {
    public static void main(String[] args) {
        System.out.println("Nhap so phan tu: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < number;i++){
            System.out.print("Nhap phan tu thu " + i + ":");

            list.add(scanner.nextInt());
        }
        System.out.println("loc cac phan tu trung nhau");
        List<Integer> listFilted = new ArrayList<>();
        for (int j = 0; j < list.size();j++) {
            if(listFilted.size() == 0){
                listFilted.add(list.get(j));
                continue;
            }
            int index = -1;
            for (int i =0; i < listFilted.size();i++){
                if(list.get(j) == listFilted.get(i)){
                    index = i;
                }
            }

            if(index == -1){
                listFilted.add(list.get(j));
            }

        }
        System.out.println(listFilted);
    }
}
