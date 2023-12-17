import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int km,yas,yolTip;
        double toplam, indirimOrani, indirimOrani2;

        Scanner input = new Scanner (System.in);
        System.out.print ("Mesafeyi (km) cinsinden giriniz : " );
        km = input.nextInt();

        if (km < 0) {
            System.out.print ("Hatalı veri girdiniz! " );

        } else {
            System.out.print ("Yaşınızı giriniz : " );
            yas = input.nextInt();

                if (yas < 0) {
                    System.out.print ("Hatalı veri girdiniz! " );
                } else {
                        Scanner inp = new Scanner (System.in);
                        System.out.print ("1.Tek yön\n2.Gidiş-dönüş olmak üzere;\nTercih ettiğiniz yolculuk tipini giriniz : " );
                        yolTip = inp.nextInt();

                        toplam = km * 0.10;
                        if (yolTip ==1 || yolTip == 2) {
                        System.out.println("Toplam Tutar = " + toplam + " TL");

                            if (yas>65) {
                                indirimOrani = km * 0.10 * 0.30;
                                System.out.println("Yaş indirim miktarınız = " + (indirimOrani) + " TL");

                                if (yolTip == 2) {
                                    indirimOrani2 = km * 0.10 * 0.20;
                                    System.out.println("Yol tipi indirim miktarınız = " + (indirimOrani2) + " TL");
                                    System.out.println("İndirimli tutar = " + (toplam - (indirimOrani + indirimOrani2)) + " TL");

                                } else {
                                    System.out.println("İndirimli tutar = " + (toplam - indirimOrani) + " TL");
                            }
                            }


                            if (yas<12) {
                                indirimOrani = km * 0.10 * 0.50;
                                System.out.println("Yaş ndirim miktarınız= " + (indirimOrani) + " TL");

                                if (yolTip == 2) {
                                    indirimOrani2 = km * 0.10 * 0.20;
                                    System.out.println("Yol tipi indirim miktarınız = " + (indirimOrani2) + " TL");
                                    System.out.println("İndirimli tutar = " + (toplam - (indirimOrani + indirimOrani2)) + " TL");

                                } else {
                                    System.out.println("İndirimli tutar = " + (toplam - indirimOrani) + " TL");
                                }
                            }
                            if (yas >=12 && yas <=24) {
                                indirimOrani = km * 0.10 * 0.10;
                                System.out.println("Yaş ndirim miktarınız = " + (indirimOrani) + " TL");

                                if (yolTip == 2) {
                                    indirimOrani2 = km * 0.10 * 0.20;
                                    System.out.println("Yol tipi indirim miktarınız = " + (indirimOrani2) + " TL");
                                    System.out.println("İndirimli tutar = " + (toplam - (indirimOrani + indirimOrani2)) + " TL");

                                } else {
                                    System.out.println("İndirimli tutar = " + (toplam - indirimOrani) + " TL");
                                }
                            }
                                if (yas > 24 && yas <=65) {

                                    if (yolTip == 2) {
                                        indirimOrani2 = km * 0.10 * 0.20;
                                        System.out.println("Yol tipi indirim miktarınız = " + (indirimOrani2) + " TL");
                                        System.out.println("İndirimli tutar = " + (toplam - (indirimOrani2)) + " TL");

                                    } else {
                                        System.out.println();
                                    }
                                }
                            } else {
                        System.out.print ("Hatalı veri girdiniz! " );
                            }
                        }
                }
        }
    }