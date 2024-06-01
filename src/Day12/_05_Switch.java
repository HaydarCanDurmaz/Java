package Day12;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {
        // Daha önce çözdüğünüz hesap makinesi sorusunu,
        // switch ile çözünüz.

        // Soru
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini yine kullanıcıdan alarak isteğe uygun olan
        // işlemi yaptırıp sonucu yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Count1 = >");
        int Count1 = scanner.nextInt();

        System.out.print(" Count2 = >");
        int Count2 = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        String secim = scanner1.next();

        switch (secim.toLowerCase()){
            case "T" : System.out.println("Toplam = " + Count1+Count2);break;
            case "Ç" : System.out.println("Çıkarma =" + (Count1-Count2));break;
            case "P" : System.out.println("Çarpma = " + Count1*Count2);break;
            case "B" : System.out.println("Bölme = " + (Count1/Count2));break;

            default:
                System.out.println("Hatalı işlem");

        }
    }
}
