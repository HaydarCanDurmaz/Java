package Day08;

public class _01_JavaAritmeticOperators {
    public static void main(String[] args) {

        int a=9;
        int b=5;

        System.out.println("Toplama işlemi");
        System.out.println("a+b => " + (a+b)); // 14

        System.out.println("Çıkarma işlemi");
        System.out.println("a-b => " + (a-b)); // 4

        System.out.println("Çarpma işlemi");
        System.out.println("a*b => " + (a*b)); // 45

        System.out.println("Bölme işlemi");
        System.out.println("a/b => " + (a/b)); // 1

        // normal sonuc 1.8 , fakat tam sayının tam sayıya bölümünde küsürat atılır.
        // bu sebeple sonuc 1 olur, yuvarlama yapmaz.  çünkü int/int
        // tam sonuç istersen bir tanesini double çevirmen yeterli
        System.out.println("(double)a/b => " + (double) a/b); // 1.8


        System.out.println("Modül işlemi");
        System.out.println("a % b sonucu = " + (a % b));  // 9%5 => 4
        System.out.println("b % a sonucu = " + (b % a));  // 5%9 => 5
        //        kısa önemli not !
        //        Modül (%)'de
        //        sol büyük ise kalanı al
        //        sol küçükse solundakini al
    }
}
