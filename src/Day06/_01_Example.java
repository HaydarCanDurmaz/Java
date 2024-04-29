package Day06;

import java.util.Scanner;

public class _01_Example {
    public static void main(String[] args) {

        // Kullanıcıdan Cadde, Sokak , PostaKodu(int) ve ülke şeklinde
        // adres bilgisi alarak yazdırınız.

        Scanner readStr = new Scanner(System.in);
        Scanner readInt = new Scanner(System.in);


        System.out.print("enter the neigborg name =");
        String neigborg = readStr.nextLine();

        System.out.print("enter the Street name =");
        String street = readStr.nextLine();

        System.out.print("enter the postCode name =");
        int postCode = readInt.nextInt();

        System.out.print("enter the country name =");
        String country = readStr.nextLine();

        System.out.println("address all information  = " + neigborg + " " + street + " " + postCode + " " + country);
    }
}
