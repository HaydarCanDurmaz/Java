package Day16;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.

        int[] number = new int[7];
        Scanner scanner = new Scanner(System.in);

        int total = 0 ;
        for (int i = 0; i < number.length; i++) {
            System.out.print("Enter Number = >>>>");
            number[i] = scanner.nextInt();
            total=total+number[i];
        }
        int ort= total  /   number.length   ;


        int miktar = 0 ;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > ort && number[i]%2  !=0 )
                miktar++;

        }
        System.out.println("ort = " + ort);
        System.out.println("miktar = " + miktar);
    }
}
