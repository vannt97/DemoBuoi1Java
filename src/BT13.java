import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BT13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu: ");
        int number = scanner.nextInt();
        List<Integer> listNumber = new ArrayList<>();
        for(int i = 0; i< number;i++){
            System.out.print("Nhap phan tu thu " + i + " :");
            listNumber.add(scanner.nextInt());
        }
        float averageValue = CalAverageValue(listNumber);
        System.out.println("Gia tri trung binh: " + averageValue);
        System.out.println("phan tu lon nhat va nho nhat cua mang");
        FindLargestAndSmallestNumber(listNumber);
        System.out.println("phan tu am lon nhat va nho nhat cua mang");
        FindLargestAndSmallestNumberNegative(listNumber);
        System.out.println("phan tu Duong lon nhat va nho nhat cua mang");
        FindLargestAndSmallestNumberPos(listNumber);
        System.out.println("In phan tu le va chan");
        PrintOddEvenNumbers(listNumber);

        System.out.println("Them mot phan tu theo index");
        System.out.println("nhap Index:");
        int index = scanner.nextInt();
        System.out.println("Nhap gia tri vao: ");
        int numberIndex = scanner.nextInt();
        AddElementByIndex(listNumber,index,numberIndex);

            System.out.println("Xoa mot phan tu theo index");
        System.out.println("Nhap index: ");
        int indexRemove = scanner.nextInt();
        RemoveElementByIndex(listNumber,indexRemove);

    }
    public static float CalAverageValue(List<Integer> listNumber ){
        int total = 0;
        for(int i = 0; i< listNumber.size();i++){
            total += listNumber.get(i);
        }
        return (float) total/listNumber.size();
    }


    public static void FindLargestAndSmallestNumber(List<Integer> listNumber){
        int max = listNumber.get(0);
        int min = listNumber.get(0);
        for(int i = 1 ;i <listNumber.size();i++){
            if(max < listNumber.get(i)){
                max = listNumber.get(i);
            }
        }
        for(int i = 1 ;i <listNumber.size();i++){
            if(min > listNumber.get(i)){
                min = listNumber.get(i);
            }
        }
        System.out.println("So lon nhat: " + max);
        System.out.println("So nho nhat: " + min);
    }

    public static void FindLargestAndSmallestNumberNegative(List<Integer> listNumber){
        List<Integer> listNumberNegative = new ArrayList<>();
        for(int i = 0; i < listNumber.size();i++){
            if(listNumber.get(i) < 0){
                listNumberNegative.add(listNumber.get(i));
            }
        }
        if(listNumberNegative.isEmpty()){
            System.out.println("Mang khong co phan tu am");
            return;
        }

        FindLargestAndSmallestNumber(listNumberNegative);
    }
    public static void FindLargestAndSmallestNumberPos(List<Integer> listNumber){
        List<Integer> listNumberPos = new ArrayList<>();
        for(int i = 0; i < listNumber.size();i++){
            if(listNumber.get(i) > 0){
                listNumberPos.add(listNumber.get(i));
            }
        }
        if(listNumberPos.isEmpty()){
            System.out.println("Mang khong co phan tu Duong");
            return;
        }
        FindLargestAndSmallestNumber(listNumberPos);
    }

    public static void PrintOddEvenNumbers(List<Integer> listNumber){
        List<Integer> listNumberOdd = new ArrayList<>();
        List<Integer> listNumberEven = new ArrayList<>();
        for(int i = 0; i < listNumber.size();i++){
            if(listNumber.get(i)%2== 0){
                listNumberEven.add(listNumber.get(i));
            }else{
                listNumberOdd.add(listNumber.get(i));
            }
        }
        System.out.println("Phan tu chan: " + listNumberEven);
        System.out.println("Phan tu le: " + listNumberOdd);
    }

    public static void AddElementByIndex(List<Integer> listNumber, int index,int number){
        System.out.println("Mang Truoc khi them: " + listNumber);
        listNumber.set(index,number);
        System.out.println("Them phan tu theo index " + index + ":" + listNumber);
    }

    public static void RemoveElementByIndex(List<Integer> listNumber,int index){
        System.out.println("Mang Truoc khi Xoa: " + listNumber);
        listNumber.remove(index);
        System.out.println("Xoa phan tu theo index " + index + ":" + listNumber);
    }
}
