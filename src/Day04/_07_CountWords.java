package Day04;

public class _07_CountWords {
    public static void main(String[] args) {
        // şu ana kadar, sayilari birbirine çevirdik
        // yazıların rakamlara çevrilmesi, rakamların yazıya çevrilmesi var

        String ad="Zorbey";
        String kelimeSayi="21";  // string halde , toplama gibi bir işleme giremez

        int sayiDeger= Integer.parseInt(kelimeSayi); // sayiya dönüşür

        int toplam=sayiDeger+sayiDeger;
        System.out.println("toplam = " + toplam);

        // toplam şu anda int yani sayi , bunu String nasıl dönüştürüm
        String strToplam= Integer.toString(toplam); // String e dönüştürür
        System.out.println("strToplam = " + strToplam);
    }
}
