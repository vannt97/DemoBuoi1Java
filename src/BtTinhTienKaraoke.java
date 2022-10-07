import java.util.Scanner;

public class BtTinhTienKaraoke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourStart;
        int hourEnd;
        int PRICE_ONE_GLASS_WATER = 10000;
        int PRICE_ONE_HOUR_KARAOKE = 30000;
        float PER_AMOUNT = (float) 0.3;
        float PER_VOUCHER = (float) 0.2;
        do{
            System.out.println("Nhap gio bat dau: ");
            hourStart = scanner.nextInt();
            System.out.println("Nhap gio ket thuc: ");
            hourEnd = scanner.nextInt();
            if(hourStart > hourEnd || hourStart < 9 || hourEnd > 24){
                System.out.println("nhap sai - nhap lai yeu cau so phai lon hon 9");
            }
        }while (hourStart > hourEnd || hourStart < 9 || hourEnd > 24);
        System.out.println("Nhap so chai nuoc khach hang order: ");
        int amountGlassWater = scanner.nextInt();
        int amountHourKaraoke = hourEnd - hourStart;
        long totalMoney ;
        if(amountHourKaraoke > 3){
            long price3HourKaraoke = 3*PRICE_ONE_HOUR_KARAOKE;
            long priceUp3HourKaraoke = (long) (price3HourKaraoke*PER_AMOUNT);
            totalMoney = (long) amountGlassWater * PRICE_ONE_GLASS_WATER + price3HourKaraoke + (amountHourKaraoke - 3)*priceUp3HourKaraoke;
        }else{
            totalMoney = (long) amountGlassWater * PRICE_ONE_GLASS_WATER + amountHourKaraoke*PRICE_ONE_HOUR_KARAOKE;
        }

        if(hourStart < 17 ){
            totalMoney = (long) ( totalMoney - (totalMoney * PER_VOUCHER));
        }

        System.out.println("Tong so tien khach phai tra la: " + totalMoney);
    }
}
