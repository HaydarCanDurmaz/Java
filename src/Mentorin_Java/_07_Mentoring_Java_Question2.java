package Mentorin_Java;

import java.util.Scanner;

public class _07_Mentoring_Java_Question2 {
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

        if (email.endsWith(".com")
        &&
        email.contains("@")
        &&
        email.indexOf("@")<email.indexOf(".com")
        &&
        !email.substring(0,email.indexOf("@")).isEmpty()
        &&
        !email.substring(email.indexOf("@")+1,email.length()-4).isEmpty()){
            System.out.println("Geçerli");
        }else
            System.out.println("Geçerli DEgil");

    }
}
