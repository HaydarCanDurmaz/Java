package Mentorin_Java;

import java.util.Scanner;

public class _01_Mentoring_Java_Question4 {
    public static void main(String[] args) {
        // Girilen bir sayinin haftanın hangi gününe denk geldigini yazdıran bir program yaziniz


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number = >");

        int Num = scanner.nextInt();

        switch (Num){
            case 1: System.out.println("Pazartesi");break;
            case 2: System.out.println("Sali");break;
            case 3: System.out.println("Çarşamba");break;
            case 4: System.out.println("Perşembe");break;
            case 5: System.out.println("Cuma");break;
            case 6: System.out.println("Cumartesi");break;
            case 7: System.out.println("Pazar");break;
            default:
                System.out.println("Wrong Number");

        }




    }
}
