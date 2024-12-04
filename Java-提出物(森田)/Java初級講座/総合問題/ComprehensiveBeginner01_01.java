import java.util.Scanner;

public class ComprehensiveBeginner01_01 { 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array;
        array = new int[3];
        int i;

        System.out.print("1,5,10の順に整数値データを入力してください >");

        for (i = 0; i <= 2; i++) {
            System.out.println("整数値データを入力してください");
            array[i] = sc.nextInt();

            System.out.println(i + 1 + "番目の要素の値は"+ array[i] + "で、2倍にすると" + 2 * array[i]+ " になり、3 で割ったあまりは"+ array[i] % 3 + "です");
        }

       sc.close();
    }
    
    
}