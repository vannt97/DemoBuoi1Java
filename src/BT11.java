import java.util.Scanner;

public class BT11 {
    public static void main(String[] args) {
        System.out.println("Nhap so tu nhien N: ");
        Scanner scanner = new Scanner(System.in);
        int number= scanner.nextInt();
        float log_2_Of_Number = Log2(number);
        System.out.println(log_2_Of_Number);
        for(int i = number - 1 ; i > 0 ;i --){
            if(i<log_2_Of_Number){
                System.out.println("result: " + i);
                break;
            }
        }
    }
    public static float Log2(int n){
        float result = (float) (Math.log(n) / Math.log(2));
        return result;
    }
}
