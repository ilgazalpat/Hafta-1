import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int k;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        k = input.nextInt();

        for (int i=0; i<=k; i++) {
            if (i % 12 == 0) {
                System.out.println(i);
            }
        }
    }
}