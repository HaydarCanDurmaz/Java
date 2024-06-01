package Day12;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        // Girilen Bir sayının   1 ler basamagındaki  degerini sayı ile yazınız

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Counts = >");
        int numbers1 = scanner.nextInt();

        int birlerBasamagi = numbers1 % 10;  // numbers1 % 10 modül bize her zaman kalanı verir

        switch (birlerBasamagi)
        {
            case 0 : System.out.println("sıfır");break;
            case 1 : System.out.println("one");break;
            case 2 : System.out.println("two");break;
            case 3 : System.out.println("three");break;
            case 4 : System.out.println("four");break;
            case 5 : System.out.println("five");break;
            case 6 : System.out.println("six");break;
            case 7 : System.out.println("seven");break;
            case 8 : System.out.println("eight");break;
            case 9 : System.out.println("nine");break;


        }
        // Kural: bir sayıdan herhangi bir rakamı almak istiyorsan:
        // istediğin rakam sonda kalacak şekilde böl, sonrada modül 10 al

        //  234  -> birler basamağı -> 4
        // 234 % 10 -> 4 -> dört



    }
}
