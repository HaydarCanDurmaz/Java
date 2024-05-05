package Day08;

import java.util.Scanner;

public class _07_Question {
    public static void main(String[] args) {
        // kullanıcının gireceği 2 sayının birbirine
        // eşit mi olup olmadığını yazdırınız

        Scanner read = new Scanner(System.in);

        System.out.println("Birinci Sayi");
        int sayi1= read.nextInt();

        System.out.println("İkinci Sayi");
        int sayi2= read.nextInt();

        System.out.println(" Eşitmi ? " + (sayi1==sayi2));

        // 2 Yöntem
        boolean esitmi=(sayi1==sayi2);
        System.out.println("esitmi = " + esitmi);
    }
}
