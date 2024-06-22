package Mentorin_Java;

import java.util.Scanner;

public class _09_Mentoring_Java_Question {
    public static void main(String[] args) {

        // Bir sayı bulmaca Oyunu isteniyor !0 - 20 arasnda sayı tut
        // sayıyı bulmaya calışsın  Kullanıcının 3 hakkı olsun
        // tahimin ederse tebriker desin degilse etmesin

        Scanner oku=new Scanner(System.in);

        int tutulanSayi = (int) (Math.random()*(20-10))+10;
        int tahminEdilenSayi;
        int sayac = 1;

        do {
            //   System.out.println(tutulanSayi);
            System.out.print("Tahmin giriniz : ");
            tahminEdilenSayi = oku.nextInt();
            if (tahminEdilenSayi==tutulanSayi){
                System.out.println("Tebrikler");break;

            }else if (tahminEdilenSayi != tutulanSayi && sayac != 3){
                System.out.println("Bilemediniz tekrar deneyin");
            }else {
                System.out.println("Bilemediniz Tutulan sayi = "+ tutulanSayi);
            }

            sayac++;

        }while (sayac<=3);





    }
}
