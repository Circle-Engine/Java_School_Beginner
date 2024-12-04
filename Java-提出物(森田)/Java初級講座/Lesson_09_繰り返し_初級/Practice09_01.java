public class Practice09_01 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 4 || i == 6 || i == 7 || i == 8 || i == 9) {
                continue;
            }

            System.out.println(2 * i);
        }
    }
}
