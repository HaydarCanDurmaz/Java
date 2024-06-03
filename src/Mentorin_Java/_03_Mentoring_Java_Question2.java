package Mentorin_Java;

import java.util.Scanner;

public class _03_Mentoring_Java_Question2 {
    public static void main(String[] args) {
        String userName1 = "TecnoStudy";
        String password1 = "12345";

        // Örnek Soru : Yukarıdaki kayıtlı bilgilere göre kullnıcıdan , kullanıcı adı ve şifresini alarak
        // 4 farklı opsiyon için login işlemlerini yazdırınız

        // 1. opsiyon - kullanıcı adı ve şifre hatalı
        // 2. opsiyon - şifre hatalı
        // 3. opsiyon - kullanıcı adı hatalı
        // 4. opsiyon - sisteme giriş başarılı

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Username = >");
        String username = scanner.nextLine();

        System.out.print("Enter passWord = >");
        String passWord = scanner.nextLine();


        if (!(userName1.equals(username)) && !(password1.equals(passWord))) {
            System.out.println("Username and Password is Wrongs !!!!!");
        } else if (userName1.equals(username) && !(password1.equals(passWord))) {
            System.out.println("Password Wrong");
        } else if (!(userName1.equals(username)) && (password1.equals(passWord))) {
            System.out.println("Username Wrong");
        } else if (userName1.equals(username) && (password1.equals(passWord))) {
            System.out.println("Succesfully :)");
        }


    }
}
