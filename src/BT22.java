import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class BT22 {
    public static void main(String[] args) {
        System.out.println("Nhap chuoi: ");
        Scanner scanner = new Scanner(System.in);
//        Tach cac chuoi ra
        String chuoi = scanner.nextLine();
//        String chuoi = "thequickbrownfoxxofnworbquickthe";
        List<String> listChuoi = new ArrayList<>();
        int j = 0;
        do{
            String subChuoiMain = chuoi.substring(j);
            int i = subChuoiMain.length();
            if(subChuoiMain.length() == 1){
                break;
            }
            do{
                String subChuoi = subChuoiMain.substring(0,i);
                if(subChuoi.length() == 1){
                    break;
                }
                listChuoi.add(subChuoi);
                i = i -1;
            }while (i>0);
            j = j +1;
        }while ( j < chuoi.length());

//        Tim cac chuoi palindrome
        List<String> listChuoiPalindrome = new ArrayList<>();
        for(String itemChuoi : listChuoi){
            String itemChuoiReverse = Reverse(itemChuoi);
            if(Objects.equals(itemChuoi,itemChuoiReverse)){
                listChuoiPalindrome.add(itemChuoi);
            }
        }
        if(listChuoiPalindrome.isEmpty()) {
            System.out.println("Khong co sub string palindrome nao het");
            return;
        };

//        Tim sub string palindromic co do dai dai nhat
        int max = listChuoiPalindrome.get(0).length();
        int indexMax = 0;
        for(int i = 1 ; i < listChuoiPalindrome.size(); i++){
            if(max < listChuoiPalindrome.get(i).length()){
                indexMax = i;
            }
        }

        System.out.println("sub string palindromic co do dai dai nhat la: " + listChuoiPalindrome.get(indexMax));

//        System.out.println("Chuoi dao nguoc: " + revers(chuoi));
    }
    public static String Reverse(String chuoi){
        String result = "";
        for(int i = 0 ; i < chuoi.length();i++){
            result += chuoi.charAt(chuoi.length() - 1 - i);
        }
        return result;
    }
}
