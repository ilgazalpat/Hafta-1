import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    String userName, password, yeniSifre;
    int select;

    Scanner input = new Scanner(System.in);
    System.out.print("Kullanıcı adınız : ");
    userName = input.nextLine();

    System.out.print("Şifreniz : ");
    password = input.nextLine();

    if (userName.equals("patika") && password.equals("java123")) {
    System.out.println("Giriş yaptınız :) ");
    } else {
    System.out.println("Şifreniz hatalı. Şifrenizi sıfırlamak ister misiniz?");
    System.out.print("1.Evet\n2.Hayır\n" + "Seçiminiz: ");
    select = input.nextInt(); }

    Scanner inp = new Scanner(System.in);
    System.out.print("Gireceğiniz şifrenin hatalı girdiğiniz veya unuttuğunuz şifre ile aynı olup olmadığını kontrol ediniz.\nYeni şifreyi giriniz : ");
    yeniSifre = inp.nextLine();

    if (yeniSifre.equals("java123")) {
        System.out.println("Şifre oluşturulamadı. Lütfen başka şifre giriniz. ");
    } else {
        System.out.println("Şifre oluşturuldu :) ");
    }
    }
 }

