import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int a, b, c, sonuc;

    Scanner input= new Scanner (System.in);
        System.out.print("1. sayıyı giriniz :");
        a = input.nextInt();

        System.out.print("2. sayıyı giriniz :");
        b = input.nextInt();

        System.out.print("3. sayıyı giriniz :");
        c = input.nextInt();

        sonuc= a + b * c - b;

System.out.println("İşlem sonucu: " + sonuc);
    }
}