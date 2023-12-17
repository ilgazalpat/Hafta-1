import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir tam sayı girin: ");
        int tamSayi = input.nextInt();

        System.out.print("Bir ondalıklı sayı girin: ");
        double ondalikliSayi = input.nextDouble();

        int tamSayiDonusum = (int) ondalikliSayi;
        double ondalikliSayiDonusum = (double) tamSayi;

        System.out.println("Tam sayıdan ondalıklı sayıya dönüşüm: " + (double) tamSayi);
        System.out.println("Ondalıklı sayıdan tam sayıya dönüşüm: " + (int) ondalikliSayi);

        input.close();
    }
}