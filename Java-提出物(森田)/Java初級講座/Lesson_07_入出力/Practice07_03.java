import java.util.Scanner;

class Practice07_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("自然数を入力してください ＞ ");
        int inputNum = sc.nextInt();

        int a = inputNum % 3;

        System.out.println(inputNum + "を 3 で割ったあまりは" + a + "です");

        sc.close();
    }
}