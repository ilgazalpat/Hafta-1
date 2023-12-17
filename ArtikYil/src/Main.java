import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int yil, deger;

        Scanner input = new Scanner (System.in);
        System.out.print("Yıl giriniz : ");
        deger = input.nextInt();

        if (deger % 4 == 0) {
            System.out.print(deger + " bir artık yıldır.");
        } else {
            System.out.print(deger + " bir artık yıl değildir.");
        }
    }
}