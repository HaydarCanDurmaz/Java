package Day09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayının tek mi çift mi oldugunu yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi giriniz=");
        int sayi=oku.nextInt();
        //int kalan=sayi%2;

        if (sayi%2 != 0)   // -1   hemde 1
            System.out.println("Tek");

        if (sayi%2 == 0)
            System.out.println("Çift");
    }
}
