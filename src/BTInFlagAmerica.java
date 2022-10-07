public class BTInFlagAmerica {
    public static void main(String[] args) {
        System.out.println("Print flag America");
        for(int i = 0; i < 12;i++){
            for(int j = 0; j < 50;j++){
                if(i < 7){
                    if(j<16){
                        if(i%2== 0){
                            if(j%2==0){
                                System.out.print("*");
                            }else {
                                System.out.print(" ");
                            }
                        }else{
                            if(j%2==0){
                                System.out.print(" ");
                            }else {
                                if(j==15){
                                    System.out.print(" ");
                                }else{
                                    System.out.print("*");
                                }
                            }
                        }
                        continue;
                    }

                }
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
