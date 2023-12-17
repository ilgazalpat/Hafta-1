import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("1 - 100 arasındaki asal sayılar:");

        for (int i = 2; i <= 100; i++) {
            Asal(i);
        }
    }

    public static void Asal(int number) {
        if (number < 2) {
            System.out.println("1 ve 0 asal sayı değildir.");

        } else {
            boolean asalSayi = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    asalSayi = false;
                    break;
                }
            }
            if (asalSayi) {
                System.out.print(number + " ");
            }
        }
    }
}