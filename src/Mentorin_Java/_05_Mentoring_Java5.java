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
        System.out.print(" Creating E-Mail Adress =  ");
        String email = scanner.nextLine();


        if (email.contains(".com"))
        {
            System.out.println("Pass");
        }else
            if(!(email.contains("p")))
            {
                System.out.println("False");
            }else
            if(!(email.contains("p")))
            {
                System.out.println("False");
            }




    }
}
