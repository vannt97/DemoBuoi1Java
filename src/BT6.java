import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        System.out.println("Nhap chuoi String: ");
        Scanner scanner = new Scanner(System.in);
        String string;
        do{
            string = scanner.next();
            if(string == " "){
                System.out.print("Nhap chuoi vao");
            }
        }while (string == "");
        String result ="";
        for(int i = string.length()-1; i >= 0;i--){
            result += string.charAt(i);
        }
        System.out.println(result);
    }
}
