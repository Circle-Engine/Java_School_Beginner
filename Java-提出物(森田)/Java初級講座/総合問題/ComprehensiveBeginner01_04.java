import java.util.Scanner;

public class ComprehensiveBeginner01_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("何段 >");
        int inputNum = sc.nextInt();
       
        if(inputNum > 5 ){
             System.out.print(" 1 ~ 5 までの整数を入力してください");
        }

        if(inputNum >= 1 && inputNum <= 5) {
         for (int i = 1; i <= inputNum; i++) {
          for (int j = 1; j <= inputNum - i; j++) {
             System.out.print(" ");
          }

          for (int j = 1; j <= i; j++) {
             System.out.print("*");
          }
  
            System.out.print("\n");

            sc.close();
         }

        }
    }
}

         
        

    



    

