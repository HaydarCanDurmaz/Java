package HomeWorkJava;

import java.util.Scanner;

public class HomeWorkJava3 {
    public static void main(String[] args) {

        //1-**I love java** olan bir String oluşturun.Bu cümlenin toplam karakter sayısını yazdırın.
        String java="**I love java** ";
        int uzunluk=java.length();
        System.out.println("uzunluk = " + uzunluk);
        System.out.println("java = " + java.length());

        //2-**Sprint planning** olan bir String oluşturun.Bu dizenin _toplam karakter sayısını_ yazdırın.
        String java1="**Sprint planning**";
        int uzunluk1=java.length();
        System.out.println("uzunluk = " + uzunluk1);
        System.out.println("java = " + java1.length());

        //3-**apple** olan bir String oluşturun.String'in _içinde_ **app** olup olmadığını **doğrula**.
        String str="**apple**";

        boolean varmi=str.contains("**app**");
        System.out.println("varmi = " + varmi);

        //4-**orange** kelimesinden oluşan bir String oluşturun.String'in **Apple**'a _eşit_ olup olmadığını doğrulayın.
        String str1="**orange**";
        String str2="**Apple**";

        if (str1==str2)
            System.out.println("Eşit");
        else
            System.out.println(" Degil " );

       // 5-**apple**  olan  bir String oluşturun.String'in **apple**'a _eşit_ olup olmadığını doğrulayın._Büyük harf veya küçük harf önemli değildir._
        String str3="**apple**";
        String str4="**Apple**";
        System.out.println("str3.equals(str4) = " + str3.equals(str4));//false
        System.out.println("str3.equalsIgnoreCase(str4) = " + str3.equalsIgnoreCase(str4)); // true

        // 6-**Florida** kelimesinden bir String oluşturun.Florida kelimesinin içindeki, sadece  **'o'**  harfinin bulunduğu indexini yazdırın.
        String s1="**Florida**";
        char ch=s1.charAt(4);
        System.out.println("ch = " + ch);

        //  7-**Thank you** olan bir String oluşturun.Thank you içindeki, sadece  **'y'** harfinin bulunduğu _konumu_ yazdırın.
        String s2="**Thank you**";
        char s12=s2.charAt(s2.indexOf(" ")+1);
        System.out.println("s12 = " + s12);
        System.out.println("c2 = " + s2.indexOf("y"));

        // 8-**Main method** oluşturun.**Mouse** değerinde bir String oluştur.Mouse String'inin 3_. sırasındaki karakteri_ yazdırın.
        String mause="**Mause**";
        System.out.println("mause.charAt(3) = " + mause.charAt(3));

        // 9-**paper** olan bir String oluşturun.String'i _büyük harfe_ çevirin ve yazdırın.örn: apple > APPLE
        String apple="apple";
        System.out.println("apple = " + apple.toUpperCase());

        // 11-**New Jersey** olan bir String oluşturun.String'i _büyük harfe_ çevirin ve yazdırın
        String Jersey="New Jersey";
        System.out.println("New Jersey = " + Jersey.toUpperCase());

        // 12-**New York** olan bir String oluşturun.String'i _küçük harfe_ çevirin ve yazdırın.
        String York="NEW YORK";
        System.out.println("NEW YORK = " + York.toLowerCase());

        // 13-**PADDLE** olan bir String oluşturun.String'i _küçük harfe_ çevirin ve yazdırın.
        String PADDLE="PADDLE";

        System.out.println("*******SPACİEL QUEZTİONSSS*******");


       // 1- Ayrı ayrı girilen ad ve soyadı aralarında bir boşluk koyarak birleştiriniz.
        String name = "Zorbey";
        String surName = "Durmaz";
        System.out.println("fullName = " + name+" "+surName);

       // 2- Girilen bir kelimenin boş(Blank) olup olmadığını yazdırınız
        Scanner read = new Scanner(System.in);
        System.out.print("Enter your words = ");
        String word= read.nextLine();

        if (word.contains(" "))
            System.out.println("Evet");
        if (!word.contains(" "))
            System.out.println("Hayır");

       // 3- girilen bir cümledeki A harfi sayısını bulunuz.(Büyük küçük harf ayırımı olmadan)
        // 1. Yöntem
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String cumle = scanner.nextLine();

        int sayac = 0;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == 'A' || cumle.charAt(i) == 'a') {
                sayac++;
            }
        }

        System.out.println("Cümlenizdeki A harfi sayısı: " + sayac);

        // 2 Yöntem
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String cumle1 = scanner1.nextLine();

        // Girdiyi küçük harfe dönüştür
        cumle1 = cumle1.toLowerCase();

        // 'a' harfinin sayısını bul
        int sayac1 = 0;
        for (int i = 0; i < cumle1.length(); i++) {
            if (cumle1.charAt(i) == 'a') {
                sayac1++;
            }
        }

        System.out.println("Cümlenizdeki A harfi sayısı1: " + sayac1);



        // 4- girilen bir kelimenin ilk ve son harfini bulunuz.
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String kelime = scanner2.nextLine();

        // İlk harfi al
        char ilkHarf = kelime.charAt(0);

        // Son harfi al
        char sonHarf = kelime.charAt(kelime.length() - 1);

        System.out.println("Girdiğiniz kelimenin ilk harfi: " + ilkHarf);
        System.out.println("Girdiğiniz kelimenin son harfi: " + sonHarf);


        // 5- girilen bir cümledeki ilk kelimeyi yazdırınız
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String Cumle = scanner.nextLine();

        int boslukIndex = Cumle.indexOf(" ");

        String ilkKelime;
        if (boslukIndex == -1){
            ilkKelime = Cumle;
        }else {
            ilkKelime = Cumle.substring(0,boslukIndex);

        }
        System.out.println("Girilen ilk cümlenin Kelimesi 12 = " + ilkKelime);



        // 6- girilen en az 3 kelimelik bir cümledeki ilk iki kelimeyi yazdırınız

        Scanner scanneR = new Scanner(System.in);
        System.out.print("En az üç kelimelik bir cümle giriniz: ");
        String cumLe = scanneR.nextLine().trim(); // İstenmeyen başlangıç ve bitiş boşluklarını kaldırır

        // Boşlukların index'ini bul
        int ilkBoslukIndex = cumLe.indexOf(' ');
        int ikinciBoslukIndex = cumLe.indexOf(' ', ilkBoslukIndex + 1);

        // İlk iki kelimeyi al
        String ilkIkiKelime;
        if (ikinciBoslukIndex == -1) {
            ilkIkiKelime = cumLe;
        } else {
            ilkIkiKelime = cumLe.substring(0, ikinciBoslukIndex);
        }

        System.out.println("Girdiğiniz cümlenin ilk iki kelimesi: " + ilkIkiKelime);



       // 7- Girilen bir cümlede kaç kelime olduğunuz bulunuz
        Scanner sCanner = new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String cuMle = sCanner.nextLine().trim(); // İstenmeyen başlangıç ve bitiş boşluklarını kaldırır

        int kelimeSayisi = 1; // En az bir kelime vardır

        // Her bir karakteri kontrol ederek kelime sayısını bul
        for (int i = 0; i < cuMle.length(); i++) {
            // Her boşluktan sonra bir kelime başlar
            if (cuMle.charAt(i) == ' ') {
                kelimeSayisi++;
            }
        }

        System.out.println("Girdiğiniz cümledeki kelime sayısı: " + kelimeSayisi);

        // 8 - 3 kelimelik ismi olan kişinin ad , 2.ad ve soyadını A.E.Y. şeklinde yazınız.

        Scanner scAnner = new Scanner(System.in);
        System.out.println("Kişinin adını, ikinci adını ve soyadını giriniz:");

        // Kullanıcıdan ad, ikinci ad ve soyadını al
        String ad = scAnner.next();
        String ikinciAd = scAnner.next();
        String soyad = scAnner.next();

        // İlk harfleri alarak A.E.Y. formatında yazdır
        String formatliIsim = ad.charAt(0) + "." + ikinciAd.charAt(0) + "." + soyad.charAt(0) + ".";
        System.out.println("A.E.Y. formatında isim: " + formatliIsim);





    }
}
