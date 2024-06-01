package Day13;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        // Girilen 30 Sayının toplam sonucunu yazınız.

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int total = 0;
        while (counter <= 5) {

            System.out.print(counter+"Enter Numbers = >");
            int count = scanner.nextInt();
            total=total+count;

            counter++; // sayac=sayac+1


        }
        System.out.println("Total = > " + total);
        System.out.println("Programing is done. ");
    }
}
