package Day12;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini yine kullanıcıdan alarak isteğe uygun olan
        // işlemi yaptırıp sonucu yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Count1 = >");
        int Count1 = scanner.nextInt();

        System.out.print(" Count2 = >");
        int Count2 = scanner.nextInt();

        System.out.println("Toplama iÇin 'T' = >");
        System.out.println("Çıkarma iÇin 'Ç' = >");
        System.out.println("Çarpma  iÇin 'P' = >");
        System.out.println("Bölme   iÇin 'B' = >");
        System.out.println(" SEÇİMİNİZ = >");

        Scanner ReadScanner = new Scanner(System.in);
        String secim = ReadScanner.next();

        // Merdivemli İf , Ladder if
        if (secim.equalsIgnoreCase("T"))
            System.out.println("Toplam " + (Count1+Count2));
        else
        if (secim.equalsIgnoreCase("Ç"))
            System.out.println("Çıkarma " + (Count1-Count2));
        else
        if (secim.equalsIgnoreCase("P"))
            System.out.println("Çarpma " + (Count1*Count2));
        else
        if (secim.equalsIgnoreCase("B"))
            System.out.println("Bölme " + (Count1/Count2));
        else
            System.out.println("Yanlış Secim Dikkali Ol Java Şakaya Gelmeaz : ))))");


    }
}
