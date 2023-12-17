import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.print("Kombinasyon 1. sayısını giriniz : ");
        int n = input.nextInt();

        System.out.print("Kombinasyon 2 sayısını giriniz : ");
        int r = input.nextInt();

        if (n<r) {
            System.out.print("Kombinasyon hatalı! ");
        }
        else {

        int total = 1;

        for(int i=1; i <= r; i++) {
            total *= n--;
            total /= i;
            }
        System.out.println( "Kombinasyon = " + total);

        }
    }
}
