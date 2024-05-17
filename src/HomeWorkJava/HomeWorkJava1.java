package HomeWorkJava;

import java.util.Scanner;

public class HomeWorkJava1 {
    public static void main(String[] args) {


        // 1- Bir String oluşturun. Konsol'a isminizi girin.İsminizi yazdırın.
        String NameSurname = "Zorbey Durmaz";
        System.out.println("NameSurname = " + NameSurname);

        //  2- Bir int oluşturun.Konsol'a herhangi bir sayı giriniz.Bu sayıyı yazdırın.
        int Count = 10;
        System.out.println("Count = " + Count);

        //  3- Bir String oluşturun.Konsol'a sevdiğiniz bir meyveyi yazın.O meyveyi yazdırınız.
        String Orange = "Apple";
        System.out.println("Orange = " + Orange);

        //  4- Bir int oluştur.Konsol'a arabanızdaki kapı sayısını girin.Bu int'i yazdırın.
        int CarsDoor = 5;
        System.out.println("CarsDoor = " + CarsDoor);

        //  5- Bir String oluştur.Konsol'a 10 sene önceki yaşadığın şehri yazın.Bu String'i yazdırın.
        String LiveCity = "İstanbul";
        System.out.println("LiveCity = " + LiveCity);

        // 6- Bir string oluşturunuz.Doğum gününüzü konsola giriniz.String'i yazdırınız.
        String BirtDay = "01.05.2003";
        System.out.println("BirtDay = " + BirtDay);

        // 7- Bir boolean oluşturunuz.Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
        boolean BankAccount = true;
        System.out.println("BankAccount Var = " + BankAccount);

        // 7- Bir boolean oluşturunuz.Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
        //         Varsa True , yoksa False olarak  konsoldan cevap veriniz.Boolean'ı yazdırınız.

        Scanner read = new Scanner(System.in);
        System.out.println("Banka Hesabınız Varmı");
        boolean BankAccountt = true;
        if (BankAccountt == true)
            System.out.println("Evet");
        else System.out.println("Hayır");

        // 8- Bir byte oluşturunuz.Konsola kg cinsinden bir ağırlık yazınız.Byte'ı yazdırınız.
        byte kgbyt1 = 2;
        byte kgbyt2 = 2;
        byte kgbyt3 = 2;

        int toplam = (byte)kgbyt1+kgbyt2+kgbyt3;
        System.out.println("toplam = " + toplam);


        //  9- Bir float oluşturunuz.Konsola boyunuzu giriniz.Float'ı yazdırınız./*

        float floatDeger=5.142143434F;

        System.out.println("floatDeger = " + floatDeger);


    }
}
