import java.util.Locale;
import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        System.out.println("Nhap Chuoi String: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char[] array = string.toCharArray();
        array[0] = Character.toUpperCase(array[0]);

        for(int i = 1; i < array.length; i++){
            if(Character.isWhitespace(array[i-1])){
                array[i] = Character.toUpperCase(array[i]);
            }
        }

        String result = new String(array);

        System.out.println(result);
    }
}
