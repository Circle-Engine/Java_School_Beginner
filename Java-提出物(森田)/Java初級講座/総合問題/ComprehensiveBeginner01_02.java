import java.util.Random;

public class ComprehensiveBeginner01_02 {
    public static void main(String[] args) {
       
        int sum = 0;
        Random random = new Random();

        for (int i = 1; i <= 10; i++) {
            if (sum > 100) {
                continue; 
            }
            int arr = random.nextInt(100) + 1;
            sum += arr;
            System.out.print(arr + " ");
        }
        
        System.out.println(sum);
    }
}