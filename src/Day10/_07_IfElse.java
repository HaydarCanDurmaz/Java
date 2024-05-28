package Day10;

import java.util.Scanner;

public class _07_IfElse {
    public static void main(String[] args) {
// yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 45 67

        Scanner read = new Scanner(System.in);
        System.out.print("Sayıları 1 bosluk bırakarak giriniz = ");
        String counts = read.nextLine();

        int boslukIndex = counts.indexOf(" ");
        String strSayi1=counts.substring(0,boslukIndex); // 45
        String strSAyi2=counts.substring(boslukIndex+1); // 67

        int count1=Integer.parseInt(strSayi1); // 45
        int count2=Integer.parseInt(strSAyi2); //  67

        if (count1 == count2)
            System.out.println("EŞİT");
        else
            System.out.println("DEGİL");




    }
}
