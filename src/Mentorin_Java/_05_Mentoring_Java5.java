package Mentorin_Java;

import java.util.Scanner;

public class _05_Mentoring_Java5 {
    public static void main(String[] args) {

    /*

    Girilen email için uygunluk koşullari:

    1- Email ".com" ile bitmeli
    2- Email "@" işareti bulundurmalı
    3- "@" işareti ".com" dan önce olmalı
    4- "@" işareti öncesinde en az 1 karakter olmalı
    5- "@" ile ".com" arasinda en az 1 karakter olmalı

     */


        Scanner scanner = new Scanner(System.in);
        System.out.print("E-mail Creating");
        String email = scanner.nextLine();


        boolean varmi = email.toLowerCase().contains(".com");
        boolean varmi1 = email.toLowerCase().contains("@");

        if (email.endsWith(".com") && email.contains("@") && varmi==true && varmi1==true)
            System.out.println("Uygun");
        else
            if (!(email.contains(".com") && !email.contains("@") && varmi==false && varmi1==false))
                System.out.println("Uygun Degil");
            else
                System.out.println();







    }
}
