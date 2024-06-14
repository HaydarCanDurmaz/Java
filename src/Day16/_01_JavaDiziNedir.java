package Day16;

import java.util.Scanner;

public class _01_JavaDiziNedir {
    public static void main(String[] args) {
        int stdNot; // 1 Tane not saklar

        // 50 person there are
        int stdNot1;
        int stdNot2;
        int stdNot3;
        // ...
        // ...
        int stdNot50;

        // bana bir tanımlamada Birden fazla deger tutabilen saklayabilen notlar bir degişkene ihtiyaçım var
        // Çözüm

        int[] Nots = new int[50]; // 50 tane int saklıyabilen  notlar isimli degişken
        Nots[0] = 75;
        Nots[1] = 88;
        // ..
        // ..
        Nots[49] = 95; // en son eleman toplam eleman sayısı -1 lengh-1 dir böylece 0-49 indexdir. 50 ögrenci notu
        // notlar [50]=56; patlar

        System.out.println("Nots = " + Nots[0]);

        System.out.println("Nots.length = " + Nots.length); // 50 yani toplam eleman sayısını verir

        // dizi nasıl okunur

        Scanner read = new Scanner(System.in);
        for (int i = 0; i < Nots.length; i++) {
            System.out.print("Enter Nots = ");
            Nots[i]= read.nextInt();

        }
        for (int i = 0; i < Nots.length; i++) {
            System.out.println(Nots[i]);

        }
    }
}
