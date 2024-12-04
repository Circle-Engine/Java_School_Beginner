import java.util.Random;

public class Practice08_01 {
    public static void main(String[] args) {
        Random random = new Random();
        int gender = random.nextInt(2);
    
        if (gender == 0) {
            System.out.println("あなたは男です");
        } 
        
        else {
            System.out.println("あなたは女です");
        }

    }
}
