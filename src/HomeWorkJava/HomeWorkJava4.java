package HomeWorkJava;

import java.util.Scanner;

public class HomeWorkJava4 {
    public static void main(String[] args) {
     /*







        9- Girilen bir sayının tersi olan sayıyı bulunuz yani 124 girildi ise 421 olan sayı elde edilecek.

        10- Girilen bir sayının tersi ile aynı olup olmadığını bulunuz. yani simetrik sayı mı?

      */

        //*   1- Kullanıcının gireceği 20 sayıdan tek olanlarının toplamını bulunuz

        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int total = 0;
        while (count <= 5) {
            System.out.print(count + "(1)Enter Numbers = >");
            int number = scanner.nextInt();

            if (number % 2 != 0) {
                total += number;
            }
            count++;
        }
        System.out.println("Tek sayıların adeti = " + total);


        //        2- Kullanıcnın gireceği 20 sayıdan kaç tanesinin tek olduğunu bulunuz


        int count1 = 1;
        int total1 = 0;
        while (count1 <= 5) {
            System.out.print(count1 + "(2)Enter Numbers = >");
            int number1 = scanner.nextInt();

            if (number1 % 2 != 0) {
                total1++;
            }
            count1++;
        }
        System.out.println("Tek sayıların adeti = " + total1);

          //        3- Kullanıcnın gireceği bir sayıya kadar olan sayıların toplamını bulunuz.

        System.out.print( "(3)Enter Numbers = >");
        int number2 = scanner.nextInt();
        int count2 = 1;
        int total2 = 0;
        while (count2 <= number2) {
            total2+=count2;
            count2++;


        }
        System.out.println("Tek sayıların adeti = " + total2);


        //  4- Kullanıcının gireceği 20 sayıdan 10 ile 30 arasındakilerinin toplamını bulunuz.
        int count4  = 1 ;
        int total4  = 0 ;

        while (count4 <= 20){
            System.out.print( "(4)Enter Numbers = >");
            int number4 = scanner.nextInt();
            if (number4 >=10 && number4 <=30){
                total4+=number4;
            }
            count4++;
        }
        System.out.println("total4 = " + total4);

        //        5- 100 kadar olan sayılardan kaç tanesinin birler basamağının 5 olduğunu bulunuz.
        int count5   = 0 ;
        int number5  = 0 ;
        while (number5<=100){
            if (number5%10==5){
                count5++;
            }
            number5++;
        }
        System.out.println("adet = " + count5);

        /* 6- Bir sayı bulmaca oyunu yapılmak isteniyor

        bilgisayar 10-20 arasında bir sayı tutsun, kullanıcı bu sayıyı bulmaya çalışssın,

        Kullanıcının bu sayıyı bulmak için 3 hakkı olsun. 3 hakkın sonunda da bilemez ise,

                bilemediniz yazıp tutulan sayıyı bildirsin.

        Eğer bilirse tebrikler yazsın.

         */

        int number6 =(int) (Math.random()*(20-10)) + 10;
        int count6  = 1;
        int guessNumber;

        do {
            System.out.print(count6 + "(6)Enter Numbers = >");
            guessNumber = scanner.nextInt();
            if (guessNumber==number6){
                System.out.println("Congratulations");
                break;
            }else if (guessNumber !=number6 && count6 !=3){
                System.out.println("try again");
            }else{
                System.out.println("You didn't know the number kept - >>>>" +number6);
            }
            count6++;

        }while (count6 <=3);

        //         7- Girilen 3 basamaklı bir sayının birler , onlar ve yuzler basamağını bulunuz.

        System.out.print( "(7)Enter Numbers = >");
        int number7 = scanner.nextInt();

        int basamank;
        int count7  = 1;

        while (number7>0){
            basamank=number7%10;
            System.out.println(count7 + " ler basamayı"+basamank);
            number7/=10;
            count7*=10;
        }

        //         8- Girilen bir sayının kaç basamak olduğunu bulunuz.

        System.out.print( "(8)Enter Numbers = >");
        int number8 = scanner.nextInt();
        int count8  = 1;
        while (number8>0){
            number8/=10;
            count8++;

        }
        System.out.println("girilen sayı" +count8+ " basamaklı");

    }
}
