package Mentorin_Java;

public class _01_Mentoring_Java {
    public static void main(String[] args) {

        int X = 5;
        int Y = 2;

        System.out.println("X + Y = " + (X + Y));
        System.out.println("X - Y = " + (X - Y));
        System.out.println("X * Y = " + (X * Y));
        System.out.println("X / Y = " + (X / Y));
        System.out.println("X % Y = " + (X % Y));
        System.out.println("Y++ : " + Y++);
        System.out.println("X++ : " + X++);
        System.out.println("--Y : " + --Y);
        System.out.println("--X : " + --X);

        X = 9;
        Y = 9;

        System.out.println(X > 3 && X < 10);
        System.out.println(X > 3 & X < 10);
        System.out.println(X > 3 & ++X < 10);

        System.out.println("****************************");

        System.out.println(Y > 3 || X < 10);
        System.out.println(Y > 3 |  X < 10);
        System.out.println(Y > 3 |  ++X < 10);

        System.out.println("****************************");

        System.out.println(10 + 20 + " : Java");
        System.out.println("Java : " + 10 + 20 + " : Java");

        System.out.println(10 * 20 + " : Java");
        System.out.println("Java : " + 10 * 20 + " : Java");

    }
}
