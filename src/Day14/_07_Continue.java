package Day14;

import java.util.Scanner;

public class _07_Continue {
    public static void main(String[] args) {

        // Kullanıcıdan 5 sayı isteyiniz.
        // Bu sayılardan 6 ile 10 arasındakiler hariç, diğerlerini toplasın.

        Scanner scanner = new Scanner(System.in);

        int total = 0;
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter Number = >");
            int number = scanner.nextInt();


            if (number>=6 && number <=10)
                continue;

            total=total+number;
            System.out.println("total = " + total);

        }

//    BREAK ve CONTINUE
//        Döngüleri etkiler
//        if şartı ile çalışır
//        Break döngüyü kırar.
//        Continue ise sadece o adımı
//        pass geçirir.döngü devam eder
    }
}
