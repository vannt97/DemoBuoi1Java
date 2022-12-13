import java.util.Scanner;

public class DemoAutheGithub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float score = scanner.nextFloat();
        if(score >= 9 && score <= 10){
            System.out.println("gioi");
        }else if (score >=8 && score < 9){
            System.out.println("kha");

        }else if(score >=7 && score <8){
            System.out.println("tien tien");

        }else if(score >=5 && score <7){
            System.out.println("trung binh");
        } else {
            System.out.println("yeu");
        }
    }
}
