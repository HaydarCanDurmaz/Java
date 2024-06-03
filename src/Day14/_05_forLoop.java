package Day14;

import java.util.Scanner;

public class _05_forLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz
        // 2.bölüm: carpimin degeri 10000 ü geçtiğinde işlem sonlansın.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number = >");
        int number = scanner.nextInt();

        int carpim = 1;
        for (int i = 1; i <= number; i++) {

            carpim = carpim * i;
            if (carpim >= 10000) {
                System.out.println(" break çalıştı");
                break;

            }

        }
        System.out.println("carpim = " + carpim);


    }
}
