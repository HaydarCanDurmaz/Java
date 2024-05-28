package Day10;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayının tek mi çift mi olduğunu yazdırınız.
        Scanner read = new Scanner(System.in);
        System.out.print("Sayı=>");
        int count= read.nextInt();

        int kalan = count % 2; // 0,1 veya -1

        if (kalan == 0)
            System.out.println("Çift");   // 0 Durumunda yapılacaklar
        else                              //!=0 Yani yukaruıdaki Degilse -1,1
            System.out.println("Tek");
    }
}
