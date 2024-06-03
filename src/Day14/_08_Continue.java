package Day14;

import java.util.Scanner;

public class _08_Continue {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your words");
        String words = scanner.nextLine();

        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i)==' ')
                continue;

            System.out.println(words.charAt(i));

        }
    }
}
