package Mentorin_Java;

import java.util.Scanner;

public class _06_Mentoring_Java_Question2 {
    public static void main(String[] args) {
        // örnek soru Girilen bir sayının pozitif çift sayı oldugunu yazdırınız

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Numbers = ");
        int number = scanner.nextInt();

     //   if (number %2==0)
       //     System.out.println("pozitif");
       // else
       //     System.out.println("negatif");

        System.out.println(number <=0 ? (number %2==0 ? "TEK" : "ÇİFT") + " "+"pozitif" : (number %2==0 ? "TEK" : "ÇİFT") +" "+"negatif");
    }
}
