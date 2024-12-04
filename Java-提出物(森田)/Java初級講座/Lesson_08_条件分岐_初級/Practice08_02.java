import java.util.Random;

public class Practice08_02 {
    public static void main(String[] args) {
        Random random = new Random();
        int age = random.nextInt(21);
    
        if (age <= 3) {
            System.out.println("あなたbabyです");
        } 
        
        else if (age > 3 && age < 18) {
            System.out.println("あなたはkidです");
        }

        else  {
            System.out.println("あなたはadultです");
        }
    }
}