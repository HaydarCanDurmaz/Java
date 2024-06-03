package Mentorin_Java;

import java.util.Scanner;

public class _04_Mentoring_Java_Question4 {
    public static void main(String[] args) {
        // Örnek Soru : Trafikte halindeki kullanıcıdan trafik ısıklarından hangisinin
        // yandıgını bilgisini alıp yönlenme yapan program yazınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Which Colours light now =");
        String light = scanner.nextLine();

        if (light.equalsIgnoreCase("Red")) {
            System.out.println("Stop");
        } else if (light.equalsIgnoreCase("Yellow")) {
            System.out.println("get ready");
        } else if (light.equalsIgnoreCase("Green")) {
            System.out.println("Go");
        }else
            System.out.println("Wrong process");
    }
}
