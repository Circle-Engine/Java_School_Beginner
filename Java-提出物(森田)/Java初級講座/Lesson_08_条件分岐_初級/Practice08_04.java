import java.util.Random;

public class Practice08_04 {

    public static void main(String[] args) {
        Random random = new Random();
        int color = random.nextInt(5)+1;
    
        if (color == 1) {
            System.out.println("今日のラッキーカラーはピンクです");
        } 
        
        else if (color == 2 || color == 3 || color == 4) {
            System.out.println("今日のラッキーカラーはレッドです");
        }

        else   {
            System.out.println("今日のラッキーカラーは ゴールド です");
        }
    
    }
}