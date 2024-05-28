package Day10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir öğrenci notuna göre 50 den büyük eşit ise geçtiniz.
        // küçük ise kaldınız yazdırınız.

        Scanner read = new Scanner(System.in);
        System.out.print("Enter Your Not = >");
        int ogr= read.nextInt();

        // 1 Yöntem
        if (ogr >= 50)
            System.out.println("Geçtiniz");

        if (ogr < 50)
            System.out.println("Kaldınız");

        // 2 Yöntem

        if (ogr >= 50){
            System.out.println("Tebrikler");
            System.out.println("Geçtiniz");
        }else
            System.out.println("Kaldınız");
    }
}
