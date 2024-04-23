package Day03;

public class _05_Example {
    public static void main(String[] args) {
        //  İki kenarı tanımlı olarak verilen bir
        //  dikdortgenin çevresini ve alanını bulunuz
        //  çarpma :   * kullanılıyor ,   x ise harf olarak kullanılıyor
        //  bir kenarı a ise , diğer kenarı b ise, cevre=a+a+b+b, alan =a*b
        int uzunkenar =115;
        int kisakenar =91;
        int cevre= uzunkenar+uzunkenar+kisakenar+kisakenar;
        int alan= uzunkenar*kisakenar;
        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);
    }
}
