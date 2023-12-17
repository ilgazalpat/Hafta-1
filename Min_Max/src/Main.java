import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        int n = input.nextInt();
        int kucuk = Integer.MAX_VALUE;
        int buyuk = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
        System.out.print( "Sayı " + (i+1) + " : ");
        int sayi = input.nextInt();

        if (sayi < kucuk) {
            kucuk = sayi;
    }
        if (sayi > buyuk) {
            buyuk = sayi;
        }
    }

            System.out.println("En küçük sayi : " + kucuk);
            System.out.println("En küçük sayi : " + buyuk);

            input.close();
    }
}

