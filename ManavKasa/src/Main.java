import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int kg;
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00,totalarmut,totalelma,totaldomates,totalmuz,totalpatlican,toplamtutar;

        Scanner input = new Scanner (System.in);

        System.out.print("Kaç kg armut aldığınızı giriniz :" );
        kg = input.nextInt();
        totalarmut = kg * armut;
        System.out.println("Armut ücreti : " + totalarmut);


        System.out.print("Kaç kg elma aldığınızı giriniz :" );
        kg = input.nextInt();
        totalelma = kg * elma;
        System.out.println("Elma ücreti : " + totalelma);

        System.out.print("Kaç kg domates aldığınızı giriniz :" );
        kg = input.nextInt();
        totaldomates = kg * domates;
        System.out.println("Domates ücreti : " + totaldomates);

        System.out.print("Kaç kg muz aldığınızı giriniz :" );
        kg = input.nextInt();
        totalmuz = kg * muz;
        System.out.println("Muz ücreti : " + totalmuz);

        System.out.print("Kaç kg patlıcan aldığınızı giriniz :" );
        kg = input.nextInt();
        totalpatlican = kg * patlican;
        System.out.println("Patlıcan ücreti : " + totalpatlican);

toplamtutar = totalarmut + totalelma + totaldomates + totalmuz + totalpatlican;
        System.out.println("Toplam tutarınız :" + toplamtutar );


    }
}