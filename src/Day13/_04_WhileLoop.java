package Day13;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {
        // Girilen 20 sayıdan sadece pozitif olanlarının
        // toplamını bulunuz

        Scanner scanner = new Scanner(System.in);

        int counter =0;
        int total =0;
        while (counter <=5){
            System.out.print(counter+" .Only Poz. Total =");
            int count = scanner.nextInt();

            if (count>0)

            total=total+count;

            counter++;
        }
        System.out.println("Total = > " + total);
        System.out.println("Programing is done. ");
    }
}
