package Day11;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {
        // Soru : Girilen bir sayının sıfır mı, negatif mi, pozitif mi
        //        olduğunu Ternary operatör ile yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Counts = >");
        int count = scanner.nextInt();

        // 1 Yöntem
        String sonuc = (count == 0) ? "sıfır" : (count > 0) ? "pozitif" : "negatif";
        System.out.println("sonuc = " + sonuc);

        // 2 Yöntem
        System.out.println( (count == 0) ? "sıfır" : (count > 0) ? "pozitif" : "negatif");
    }
}
