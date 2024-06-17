package Day16;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // 50 kişilik bir sınıfın notlarını giriniz ve ortalamadan büyük
        // kaç not olduğunu bulunuz ve bunları yazdırnız.

        int[] stdNots = new int[5];
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        for (int i = 0; i < stdNots.length; i++) {
            System.out.print("Enter Nots = >");
            stdNots[i] = scanner.nextInt();
            total = total + stdNots[i];
        }
        int ort = total / stdNots.length;

        int gecenler = 0;
        for (int i = 0; i < stdNots.length; i++) {
            if (stdNots[i] > ort) {
                System.out.println("Ortalama'dan Büyükse Notlar =>" + stdNots[i]);
                gecenler++;
            }
        }
        System.out.println("gecenler = " + gecenler);

        int kalanlar = 0;
        for (int i = 0; i < stdNots.length; i++) {
            if (stdNots[i] < ort) {
                System.out.println("Ortalama'dan Küçükse Notlar =>" + stdNots[i]);
                kalanlar++;
            }
        }
        System.out.println("ort = " + ort);
        System.out.println("kalanlar = " + kalanlar);
    }
}
