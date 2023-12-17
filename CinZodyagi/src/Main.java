import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int yil, kalan;
        Scanner input = new Scanner(System.in);
        System.out.print ("Doğum yılınızı giriniz : ");
        yil = input.nextInt();
        kalan = yil % 12;

        if (kalan == 0) {
            System.out.print ("Maymun");

        } else if (kalan == 1) {
            System.out.print ("Horoz");

        } else if (kalan == 2) {
            System.out.print ("Köpek");

        } else if (kalan == 3) {
            System.out.print ("Domuz");

        } else if (kalan == 4) {
            System.out.print ("Fare");

        } else if (kalan == 5) {
            System.out.print ("Öküz");

        } else if (kalan == 6) {
            System.out.print ("Kaplan");

        } else if (kalan == 7) {
            System.out.print ("Tavşan");

        } else if (kalan == 8) {
            System.out.print ("Ejderha");

        } else if (kalan == 9) {
            System.out.print ("Yılan");

        } else if (kalan == 10) {
            System.out.print ("At");

        } else if (kalan == 11) {
            System.out.print ("Koyun");
        }
    }
}