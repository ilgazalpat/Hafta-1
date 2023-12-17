import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        int n = input.nextInt();
        int a = 0, b = 1;

        System.out.println("Fibonacci serisi:");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            b = a + b;
            a = b - a;
        }
    }
}
