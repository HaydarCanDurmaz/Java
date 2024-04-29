package Day05;

import java.util.Scanner;

public class _09_Example {
    public static void main(String[] args) {
        // Kullanıcıdan ağırlığını double, boyunu double olarak alınız.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kitle indexini de bularak yazdırınız   kg/ (boy*boy)

        Scanner read = new Scanner(System.in);
        System.out.print("enter your weight =");
        double weight= read.nextDouble();

        System.out.print("enter your height =");
        double height= read.nextDouble();

        System.out.println("height ,weight  = " + height+weight);

        double bodymassindex = weight / (height*height);

        System.out.print("bodymassindex = " + bodymassindex);
    }
}
