package Day10;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner read = new Scanner(System.in);
        System.out.print("Pasaport KURALLARINI Giriniz =>");
        String str = read.nextLine();

        // 1 Yöntem
        int uzunluk = str.length();
        boolean varmi = str.toLowerCase().contains("pass");

        if (uzunluk >= 8 && uzunluk <=12 && varmi==false)
            System.out.println("uygun");
        else  {
            System.out.println("degil");

        }

        // 2 Yöntem
        if (str.length() >= 8 && str.length() <= 12 && str.toLowerCase().contains("pass")==false)
            System.out.println("uygun");
        else
            System.out.println("UYGUN DEgil");

        // 3 Yönten
        if (str.length() >= 8 && !str.contains("pass") && str.length() <=12)
            System.out.println("UYGUN " );
        else
            System.out.println("UYGUN DEgil");



    }
}
