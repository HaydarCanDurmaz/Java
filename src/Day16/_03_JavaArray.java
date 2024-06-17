package Day16;

import java.util.Scanner;

public class _03_JavaArray {
    public static void main(String[] args) {
        int [] dizi  = new int[5];
        int [] dizi1 = {1,2,3,4,5};

        String[] sentes = new String[5];
        boolean[] dizi2 = new boolean[5];
        double[] oranlar = new double[5];

        for (int i = 0; i <dizi.length ; i++) {
            System.out.println("dizi = " + dizi[i]);
        }
        for (int i = 0; i <dizi1.length ; i++) {
            System.out.println("dizi1 = " + dizi1[i]);
        }
        for (int i = 0; i <sentes.length ; i++) {
            System.out.println("sentes = " + sentes[i]);
        }
        for (int i = 0; i <dizi2.length ; i++) {
            System.out.println("dizi2 = " + dizi2[i]);
        }
        for (int i = 0; i <oranlar.length ; i++) {
            System.out.println("oranlar = " + oranlar[i]);
        }

    }
}
