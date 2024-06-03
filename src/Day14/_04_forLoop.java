package Day14;

import java.util.Scanner;

public class _04_forLoop {
    public static void main(String[] args) {
        // kullanıcının gireceği bir rakama(dahil) kadar
        // olan sayıların toplamını bulunuz.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number = >");
        int number = scanner.nextInt();

        int total = 0;
        for (int i = 0; i < number; i++) {
            total=total+i;
            System.out.println("total = " + total);


        }
    }
}
