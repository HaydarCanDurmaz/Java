package Day12;

import java.util.Scanner;

public class _01_JavaRandom {
    public static void main(String[] args) {
        // 0 -5 arası gibi sayılar ürettik, hep sıfırdan başladı
        //  4 -9 arası nasıl üretirdimm
        //Yöntem ŞU : önce aralık olarak normal üret (9-4 ) yani 0 - 5 arası
        //Üretilmiş olan sayıya min sayıyı ekle , üretitmiş sayı +4
        // (int)(Math.random()*(max*min))+min

        Scanner scanner = new Scanner(System.in);
        System.out.print("MİN = >");
        int min = scanner.nextInt();

        System.out.print("MAX = >");
        int max = scanner.nextInt();

        int rndCount = (int) (Math.random()*(max-min)) + min;
        System.out.println("rndCount = " + rndCount);
    }
}
