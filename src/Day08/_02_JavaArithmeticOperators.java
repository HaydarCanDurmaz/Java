package Day08;

public class _02_JavaArithmeticOperators {
    public static void main(String[] args) {
        int sayac = 0;
        sayac = sayac + 1; // sayacın degerini 1 tane artırıyor : 1
        sayac++;           // sayacın degerini 1 tane artırıyor : 2
        ++sayac;           // sayacın degerini 1 tane artırıyor : 3


        sayac = sayac - 1; // sayacın degerini 1 tane artırıyor : 2
        sayac--;           // sayacın degerini 1 tane artırıyor : 1
        --sayac;           // sayacın degerini 1 tane artırıyor : 0

        System.out.println("sayac = " + sayac);

        /*************************************/

        int toplam = 5 + sayac;  // 5 olur
        System.out.println("toplam = " + toplam); // 5
        System.out.println("sayac = " + sayac);   // 0

        toplam = 5 + sayac++;   // toplam = 5+sayac ve sonra sayac =sayac+1
        // toplam = 5 e sayac = 1 oldu
        System.out.println("toplam = " + toplam); // 5
        System.out.println("sayac = " + sayac);   // 1

        toplam = 5 + ++sayac;   //// sayac=sayac+1 onra toplam=5+sayac  7 olur
        System.out.println("toplam = " + toplam); // 7
        System.out.println("sayac = " + sayac);   // 2

         // Özet:  ++ lar sağda ise önce işlem sonra artış
        //        ++ lar solda ise önce artış sonra işlem.

    }
}
