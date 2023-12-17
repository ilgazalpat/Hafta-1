import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner (System.in);
        int right = 3;
        int balance = 1500;

        int select;
        while (right>0) {
            System.out.print ("Kullanıcı adınız : ");
            userName = input.nextLine();

            System.out.print ("Şifreniz : ");
            password = input.nextLine();

            if (userName.equals ("patika") && password.equals ("dev123")) {
                System.out.println("Merhaba, Kodlama Bankasına Hoşgeldiniz :) ");

                do {
                    System.out.println("1. Para yatırma\n" +
                            "2. Para çekme\n" +
                            "3. Bakiye sorgulama\n" +
                            "4. Çıkış yapma");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print ("Para miktarı : ");
                            int price = input.nextInt();
                            balance += price;
                            break;

                        case 2:
                            System.out.print ("Para miktarı : ");
                            price = input.nextInt();

                            if (price > balance) {
                                System.out.println("Bakiye yetersiz");
                            } else {
                                balance -= price;
                            break;
                            }

                        case 3:
                            System.out.print ("Bakiyeniz : " + balance  + "\n");
                            break;
                }
            } while (select != 4);
                    System.out.print ("Tekrar görüşmek üzere :)");
                    break;
            } else {
                    right --;
                    System.out.println("Hatalı kullanıcı adı veya şifre girdiniz. Lütfen tekrar deneyiniz.");
                    if ( right == 0) {
                        System.out.print ("Hesabınız bloke edilmiştir. Lütfen bankanız ile görüşünüz.");

                    } else {
                        System.out.println("Kalan hakkınız : " + right);

                    }
            }
        }
    }
}