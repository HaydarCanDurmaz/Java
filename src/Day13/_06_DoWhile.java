package Day13;

import java.util.Scanner;

public class _06_DoWhile {
    public static void main(String[] args) {
        // Kullanıcıın 0 degeri girene kadar ,
        // Girdigi sayların toplamını bulunuz

        Scanner scanner = new Scanner(System.in);
         int count ;
         int total =0;

        System.out.print( " Enter the number = >");
        count= scanner.nextInt();
        total=total+count;
        while (count !=0)
        {
            System.out.print("Enter the number = >");
            count= scanner.nextInt();
            total=total+count;
        }
        System.out.println("total = " + total);
    }
}
