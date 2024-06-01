package Day12;

import java.util.Scanner;

public class _04_Switch {
    public static void main(String[] args) {

        // Kullanıcıdan girdigi Gün numarasını karşılık gelen günü adını yazınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Day No = ");
        int DayNo = scanner.nextInt();

       /* if (DayNo == 1)
            System.out.println("Monday");
        else
            if (DayNo == 2)
                System.out.println("Tuesday");

        */
        switch (DayNo){
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednasday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Freiday"); break;
            case 6: System.out.println("Saturdau"); break;
            case 7: System.out.println("Sunday"); break;

            default: System.out.println("Hatalı Numara"); // caselerin dışında ise


        }
    }
}
