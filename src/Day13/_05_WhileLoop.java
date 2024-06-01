package Day13;

public class _05_WhileLoop {
    public static void main(String[] args) {
        // 100 e kadar olan sayıların toplamını bulunuz

        // -sayi girişi,sayı okuma var mı  YOK
        // 1+2+3+4+5+6+7+8+9........99+100

        int counter = 1 ;
        int total = 0 ;
        while (counter<=100){


            total=total+counter;
            counter++;
        }
        System.out.println("Total = > " + total);
        System.out.println("Programing is done. ");
    }
}
