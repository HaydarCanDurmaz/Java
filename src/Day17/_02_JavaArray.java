package Day17;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz
        // for döngüsü ile yapalım
        // Bu gun hava cok guzel -> 5

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter words = >>>");
        String text = scanner.nextLine();

        int emptyindex = 0;
        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == ' ')
                emptyindex++;
        }
        System.out.println("(emptyindex = " + (emptyindex+1));
    }
}
