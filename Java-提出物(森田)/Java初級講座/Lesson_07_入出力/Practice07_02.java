import java.util.Scanner;

class Practice07_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,"Shift-JIS");

        System.out.print("キーボードから「大谷翔平」」と入力してください ＞ ");
        String input = sc.nextLine();

        System.out.println("MLBで二刀流として活躍している日本人野球選手は" + input + "です。" );

        sc.close();
    }
}