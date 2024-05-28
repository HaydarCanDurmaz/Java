package Day10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Girilen vize(%50) ve final(%50) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük-eşit ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.

        // 2 tane sınav oldun. topla 2 ye böl (ortalaması)
        // final kelimesi java ya ait kelime

        Scanner read1 = new Scanner(System.in);
        System.out.print("Vize Not = >");
        double vizeNot = read1.nextInt();

        System.out.print("Final Not = >");
        double finalNot = read1.nextInt();

        double ort = (vizeNot+finalNot)/2.0;

        if (ort >= 60)
            System.out.println("Geçtiniz");
        else
            System.out.println("Kaldınız");

        System.out.println("ort = " + ort);

        // Süslü parantez kuralı:  sadece 1 satır(;) çalışacak ise zorunlu değil,
        // birden fazla ise zorunlu. Her zaman koyulabilir, hiç bir mahsuru yok
    }
}
