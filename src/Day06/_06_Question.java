package Day06;

import java.util.Scanner;

public class _06_Question {
    public static void main(String[] args) {
        // Girilen bir ad soyadı örneğin "Ismet Temur" I.T.  şeklinde yazdırınız.


        Scanner read = new Scanner(System.in);

        System.out.print("Enter the your Name and Surname =");// adSoyad veri olarak alındı

        // Ismet Temur -> I.T.  -> I -> charAt(0) I.
        // indexOf(" ")-> boşluğun indexini veriyor, bunun 1 fazlası charAt() -> T yi verir

        String nameSurname = read.nextLine();
         char firstName = nameSurname.charAt(0);
         int emptyIndex=nameSurname.indexOf(" ");
         char firstSurname =nameSurname.charAt(emptyIndex+1);
        System.out.println(firstName+"."+firstSurname+".");

        // char soyadIlkHarf= firstName.charAt(nameSurname.indexOf(" ")+1);

    }
}
