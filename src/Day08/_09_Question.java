package Day08;

import java.util.Scanner;

public class _09_Question {
    public static void main(String[] args) {
        // Girilen bir cümledeki ilk kelimeyi yazdırınız

        Scanner read = new Scanner(System.in);
        System.out.println("Cümle Giriniz = > ");
        String cumle = read.nextLine();

        // bugun hava sıcak , // boşluk sınırı veriyor

        int boslukIndex=cumle.indexOf(" ");
        String ilkKelime=cumle.substring(0,boslukIndex);
        System.out.println("ilkKelime = " + ilkKelime);
    }
}
