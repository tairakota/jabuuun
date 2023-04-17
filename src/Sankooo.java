import java.util.Scanner;

public class Sankooo {
    public static void main(String[] args) {
//        System.out.print("数値を入力してください。：");
//        var sc = new Scanner(System.in);
//        var s1 = sc.nextLine();
//        var num1 = Integer.parseInt(s1);
//
//
//        if (num1 >= 60){
//            System.out.println("合格です");
//        }
//        else {
//            System.out.println("不合格です");
//        }
//        sc.close();

        System.out.print("数値を入力してください。：");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var num1 = Integer.parseInt(s1);

        var result = num1 >= 60 ? "合格です" : "不合格です";

        System.out.println(result);

        sc.close();
    }
}
