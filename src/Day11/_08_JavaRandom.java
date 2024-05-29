package Day11;

public class _08_JavaRandom {
    public static void main(String[] args) {

       // Math.random() : double saı üretir . 0 - 0,999999999 arasında

        double randCount=Math.random();
        System.out.println("randCount = " + randCount);

        // 0-6 arası üretsin
        // 6 ile çarparım
        // 0 - 5 5,99999
        // int çevirirsem 0-5

        int rntTamSayi = (int) (Math.random() * 6);
        System.out.println("rntTamSayi = " + rntTamSayi);
    }
}
