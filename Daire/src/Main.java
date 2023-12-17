import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
int r, x;
double pi = 3.14;

Scanner input = new Scanner (System.in);
System.out.print("Dairenin yarıçapını giriniz:");
r = input.nextInt();

System.out.print("Dairenin merkez açısını giriniz:");
x = input.nextInt();

double alan = (pi * (r * r) * x)/ 360;

System.out.println("Dairenin alanı :" + alan);

    }
}