import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,k;
        Scanner input = new Scanner (System.in);
        System.out.print("Üssü alınacak sayı : ");
        n = input.nextInt ();

        System.out.print("Üs olacak sayı : ");
        k = input.nextInt ();

        int total = 1;
        int i = 1;

        for (i =1; i<=k; i++)
            total *= n;
            i++;
            System.out.print( "Cevap : " + total);
    }
}
