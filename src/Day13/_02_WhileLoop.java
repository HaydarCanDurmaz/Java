package Day13;

public class _02_WhileLoop {
    public static void main(String[] args) {
         // Ekrana 5 kez MERHABA , HELLO , HALLO , PRiWİET Yazdırıcaz.

        int counter = 0;
        while (counter<5) // iken yap : şartlı yazıyoruz. dönme şartı
        {
            // Her Döndügünde yazacaktır
            System.out.println(counter+"Merhaba , Hello , Hallo , Priviet");
            counter++;
        }
        System.out.println("Programing is done. ");
    }
}
