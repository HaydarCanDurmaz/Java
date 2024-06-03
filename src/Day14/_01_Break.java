package Day14;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
        // girilen bir sayının, 2 aynı sayının carpımına
        // eşit olup olmadığını bulunuz.

        // 4 girdim -> 2*2 bu tam karedir.
        // 5 girdim -> değildir.
        // 9 girdim -> 3*3

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number =");
        int number = scanner.nextInt();

        int counter = 0;
        while (counter < number)
        {
            if (counter*counter==number)
            {
                System.out.println("Tam Karedir");
                break;
            }
            System.out.println("counter = " + counter);
            counter++;
        }

    }
}
