package Day11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {
        // Kullanıcının Girecegi Sayının Tek'mi , Çift'mi Oldugunu Yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Counts");
        int count = scanner.nextInt();

        if (count %2 == 0)
            System.out.println("ÇİFT");
        else
            System.out.println("TEK");

        String sonuc = (count %2 == 0) ? "Çift" : "Tek";// ( ? ) if demek , ( : ) else demek
        System.out.println("sonuc = " + sonuc);

        System.out.println(((count %2 == 0) ? "çift" : "tek"));
    }
}
