package Day11;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {
        //  Math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz

        Scanner scanner =new Scanner(System.in);
        System.out.print("A's Values =>");
        int A= scanner.nextInt();

        System.out.print("B's Values =>");
        int B= scanner.nextInt();

        System.out.print("C's Values =>");
        int C= scanner.nextInt();

        // 1 .Yönten
        int enb=Math.max(A,B);
        enb=Math.max(enb,C);
        System.out.println("enb = " + enb);

        // 2. Yöntem

        int enb2 = Math.max(A,Math.max(B,C));
        System.out.println("enb2 = " + enb2);


    }
}
