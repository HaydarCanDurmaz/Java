package Gun07;

import java.util.Scanner;

public class _06_Question {
    public static void main(String[] args) {

        // Tek seferde girilen bir ad soyadın(tam ad) adını ve soyadını ayırıp,
        // ayrı ayrı yazdırınız. (sadece ad ve soyad)

        Scanner read = new Scanner(System.in);

        System.out.println(" enter your name and surname ");
        String fullname1 = read.nextLine();
        //ismet temur, Ali Koç
        // ad: 0, boslugun indexine kadar
        // soyad: bosluk+1, sonuna kadar

        int boslukIndex=fullname1.indexOf(" ");
        String ad= fullname1.substring(0, boslukIndex);
        String soyad = fullname1.substring(boslukIndex+1);  // 2 indexi vermezsen sonuna kadar alır

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);


        // 2Yöntem
        //               0123456789101112
        String fullname="Zorbey Durmaz";

        String part1=fullname.substring(0,6);
        System.out.println("part1 = " + part1);

        String part2=fullname.substring(7,13);
        System.out.println("part2 = " + part2);
    }
}
