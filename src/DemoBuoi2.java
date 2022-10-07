import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoBuoi2 {
    public static void main(String[] args) {
        System.out.println("nhap 5 so tu nhien");
        Scanner scanner = new Scanner(System.in);
        List<Number> arrInt = new ArrayList<>();
        for(int i = 0; i < 5;i++){
            System.out.println("Nhap so thu " + i + ":");
            arrInt.add( scanner.nextInt());
        }
        System.out.println((arrInt));
        for(int i = 0; i < arrInt.size() - 1;i++){
            for(int j = i +1;j < arrInt.size() ; j++){
                int num1 = (int) arrInt.get(i);
                int num2 = (int) arrInt.get(j);
                int temp = num2;
                if(num1 > num2){

                    arrInt.set(j,num1);
                    arrInt.set(i,temp);
                }
            }
        }
        System.out.println(arrInt);

    }
}
