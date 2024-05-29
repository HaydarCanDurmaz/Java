package Day11;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {
        //Soru: Girilen sayı 50 den büyük ise 1 , değilse 0 değerini
        // ekrana yazdırınız. Ternary operatör ile yapınız.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Counts");
        int count = scanner.nextInt();

        // 1 Yöntem
        String sonuc =(count > 50 ) ? "1" : "0";
        System.out.println("sonuc = " + sonuc);



        // 2 Yöntem
        System.out.println((count > 50) ? "1" : "0");
    }
}
