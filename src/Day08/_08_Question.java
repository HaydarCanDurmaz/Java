package Day08;

import java.util.Scanner;

public class _08_Question {
    public static void main(String[] args) {
   // girilen bir sayının tek sayı olup olmadığını yazdırınız.

        Scanner read = new Scanner(System.in);

        System.out.println("Sayi Giriniz = ");
        int sayi= read.nextInt();

        // 3  5   100000009   100003   tek dir.

        int kalan = sayi % 2; // bu 1 eşitse tekdir

        System.out.println("tek mi "+ (kalan==1));

        //2.Yöntem
        System.out.println("tek mi "+ (sayi%2 == 1));

        //3.Yöntem
        System.out.println("tek mi "+ (sayi%2 != 0)); // negatif girilme ihtimali
        //sebebi ile bu en doğru , çünkü bir üstte negatif girilirse -1 gelir
    }
}
