import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        double ortalama;

        Scanner input = new Scanner (System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();

        if ((mat <= 100) && (mat >= 0)) {
            System.out.print("Fizik notunuz: ");
        } else {
            System.out.println("Hatalı değer girdiniz. ");
        }

        fizik = input.nextInt();
        if ((fizik <= 100) && (fizik >= 0)) {
            System.out.print("Türkçe notunuz: ");
        } else {
            System.out.println("Hatalı değer girdiniz. ");
        }

        turkce = input.nextInt();
        if ((turkce <= 100) && (turkce >= 0)) {
            System.out.print("Kimya notunuz: ");
        } else {
            System.out.println("Hatalı değer girdiniz. ");
        }

        kimya = input.nextInt();
        if ((kimya <= 100) && (kimya >= 0)) {
            System.out.print("Müzik notunuz: ");
        } else {
            System.out.println("Hatalı değer girdiniz. ");
        }

        muzik = input.nextInt();
        if ((mat <= 100) && (mat >= 0)) {
            System.out.println("Not ortalamanız : " +   (ortalama = (mat + fizik + turkce + kimya + muzik) / 5));

            if (ortalama <= 55.00) {
                System.out.println("Üzgünüz, sınıfta kaldınız. ");
            } else {
                System.out.println("Sınıfı geçtiniz :) ");
            }

        } else {
            System.out.println("Hatalı değer girdiniz. ");

        }
    }
}

