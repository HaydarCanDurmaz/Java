package Day13;

import java.util.Scanner;

public class _01_Switch {
    public static void main(String[] args) {
        //   Girilen bir Ay numarasına göre ayın kaç gün sürdüğünü yazdırınız.

        Scanner scanner =  new Scanner(System.in);
        System.out.print("Which month Are We And How Many Days ? =");
        int month = scanner.nextInt();

        switch (month)
        {
            case 1: System.out.println("January =" + 31);break;
            case 2: System.out.println("February ="+29);break;
            case 3: System.out.println("March  ="+31);break;
            case 4: System.out.println("April = "+30);break;
            case 5: System.out.println("May ="+31);break;
            case 6: System.out.println("June = "+30);break;
            case 7: System.out.println("July = "+31);break;
            case 8: System.out.println("August = "+31);break;
            case 9: System.out.println("September ="+30);break;
            case 10: System.out.println("October = "+31);break;
            case 11: System.out.println("November = "+30);break;
            case 12: System.out.println("December = "+31);break;

            default:
                System.out.println("Wrong Month");

        }
        switch (month)
        {
            case 1: System.out.println("January =");
            case 3: System.out.println("March  =");
            case 5: System.out.println("May =");
            case 7: System.out.println("July = ");
            case 8: System.out.println("August = ");
            case 10: System.out.println("October = ");
            case 12: System.out.println("December = "+31);break;

            case 2: System.out.println("February ="+29);break;

            case 4: System.out.println("April = ");
            case 6: System.out.println("June = ");
            case 9: System.out.println("September =");
            case 11: System.out.println("November = "+30);break;

            default:
                System.out.println("Wrong Month");
                }




    }
}
