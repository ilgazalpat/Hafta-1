import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz : ");
        int n1 = input.nextInt();

        System.out.print("2. Sayıyı giriniz : ");
        int n2 = input.nextInt();

        int carpim = n1 * n2;

        while (n1 != n2) {
            if (n1 > n2) {
                n1 -= n2;
            } else {
                n2 -= n1;
            }
        }

        int ekok = carpim / n1;

        System.out.println("EBOB : " + n1);
        System.out.println("EKOK: " + ekok);

    }
}

