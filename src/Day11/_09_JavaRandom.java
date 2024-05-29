package Day11;

import java.util.Scanner;

public class _09_JavaRandom {
    public static void main(String[] args) {
         // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number = >");
        int counts= scanner.nextInt();

        int tutulanSayi =(int) (Math.random()*counts);

        System.out.print("Tahmininiz =>");
        int guess=scanner.nextInt();

        if (guess ==tutulanSayi)
            System.out.println("Tebriler");
        else
            System.out.println("Bilemedinkii : )");
    }
}
