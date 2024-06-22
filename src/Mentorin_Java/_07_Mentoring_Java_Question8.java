package Mentorin_Java;

import java.util.Scanner;

public class _07_Mentoring_Java_Question8 {
    public static void main(String[] args) {
         // Girilen 3 basamaklı bir sayının birler . onlar ve yüzler basamagını bulunuz


        Scanner scanner = new Scanner(System.in);
        System.out.print("Numbers = >");
        int Numbers = scanner.nextInt();

        int basamak ;
        int counter = 1 ;


        while (Numbers > 0){
            basamak = Numbers % 10;
            System.out.println(counter + "ler Basamagı"+" -  "+basamak);
            Numbers /=10;
            counter*=10;
        }
    }
}
