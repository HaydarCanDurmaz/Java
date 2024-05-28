package Day10;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse
        // hayır yazdırınız.

        Scanner read = new Scanner(System.in);
        System.out.print("Cümle Yazınız = >");
        String str=read.nextLine();

        // boolean Varmi = str.toLowerCase().contains("study");
                               // Varmi == true  Olabilir
        if (str.length() >= 10 && str.toLowerCase().contains("study"))
            System.out.println("Evet");
        else
            System.out.println("Hayır");



    }
}
