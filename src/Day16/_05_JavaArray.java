package Day16;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz. trtr, kanald,atv,fox,habertürk
        // Daha sonra random olarak bir tanesini seçip ekrana seçileni yazıdırnız.
        // {"trt","atv"}



        String[] televizyon = {"TRTtv","Kanal D ","ATV","FOX","HaberTürk"};

        int rasgele = (int) (Math.random()*televizyon.length);

        System.out.println("Rasgele Secilen Tv = >" + televizyon[rasgele]);

    }
}
