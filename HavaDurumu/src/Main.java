import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklığı giriniz: ");
        heat = input.nextInt();

        if ( heat < 5 ) {
            System.out.println("Kayak yapabilirsiniz. ");
        } else if (heat >= 5 && heat <15) {
            System.out.println("Sinemaya gidebilirsiniz. ");
        } else if (heat == 15) {
                System.out.println("Hem sinemaya hem de pikniğe gidebilirsiniz. ");
        } else if (heat > 15 && heat <25) {
            System.out.println("Pikniğe gidebilirsiniz. ");
        } else if (heat == 25) {
            System.out.println("Hem pikniğe hem de yüzmeye gidebilirsiniz. ");
        } else if (heat > 25) {
            System.out.println("Yüzmeye gidebilirsiniz. ");
        }

    }
}