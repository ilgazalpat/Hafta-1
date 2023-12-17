import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
int a,b,c,u,cevre;
double alan;

Scanner girdi = new Scanner(System.in);
System.out.print("1.Kenarı Griniz: ");
        a = girdi.nextInt();

System.out.print("2.Kenarı Giriniz: ");
b = girdi.nextInt();

System.out.print("3.Kenarı Giriniz: ");
c = girdi.nextInt();

        u = (a + b + c)/2;
        cevre = 2 * u;
        
System.out.println("Üçgenin Çevresi: " + cevre);

alan= Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.println("Üçgenin Alanı: " + alan);
        }
    }
