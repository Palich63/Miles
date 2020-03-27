import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input price of ticket: ");
        int price = (int) in.nextFloat();
        int miles = 0;
        miles = price / 20;
        System.out.println("Accrued miles: " + miles);

    }
}
