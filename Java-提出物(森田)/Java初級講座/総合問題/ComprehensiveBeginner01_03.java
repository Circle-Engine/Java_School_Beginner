import java.util.Random;

public class ComprehensiveBeginner01_03 {
    public static void main(String[] args) {
    Random random = new Random();
        int man = random.nextInt(3) + 1;
        int woman = random.nextInt(3) + 1;
        int child = random.nextInt(3) + 1;

        if (man == woman && man != child) {
            if(man == 1 && child == 2) {
            System.out.println("childが勝ちました");
            }

            else if(man == 1 && child == 3 ) {
            System.out.println("manとwomanが勝ちました");
            }

            else if(man == 2 && child == 1 ) {
            System.out.println("manとwomanが勝ちました"); 
            }

            else if(man == 2 && child == 3 ) {
            System.out.println("childが勝ちました");
            } 

            else if(man == 3 && child == 1 ) {
            System.out.println("childが勝ちました"); 
            }

            else if(man == 3 && child == 2 ) {
            System.out.println("manとwomanが勝ちました");
            }
        } 

        else if (man == child && man != woman) {
            if(man == 1 && woman == 2) {
            System.out.println("womanが勝ちました");
            }

            else if(man == 1 && woman == 3 ) {
            System.out.println("manとchildが勝ちました");
            }

            else if(man == 2 && woman == 1 ) {
            System.out.println("manとchildが勝ちました"); 
            }

            else if(man == 2 && woman == 3 ) {
            System.out.println("womanが勝ちました"); 
            }

            else if(man == 3 && woman == 1 ) {
            System.out.println("womanが勝ちました"); 
            }

            else if(man == 3 && woman == 2 ) {
            System.out.println("manとchildが勝ちました");
            }
        } 

        else if (woman == child && man != woman) {
            if(woman == 1 && man == 2) {
            System.out.println("manが勝ちました");
            }

            else if(woman == 1 && man == 3 ) {
            System.out.println("womanとchildが勝ちました");
            }

            else if(woman == 2 && man == 1 ) {
            System.out.println("womanとchildが勝ちました"); 
            }

            else if(woman == 2 && man == 3 ) {
            System.out.println("manが勝ちました"); 
            }

            else if(woman == 3 && man == 1 ) {
            System.out.println("manが勝ちました");
            } 

            else if(woman == 3 && man == 2 ) {
            System.out.println("womanとchildが勝ちました");
            }
        } 

        else if (man == woman && man == child && woman == child ) {
            System.out.println("あいこです");
        }

        else if (man != woman && man != child && woman != child ) {
                System.out.println("あいこです");
        }
    }
}
