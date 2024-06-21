package Day17;

import java.util.Scanner;

public class _05_JavaSplitMetodu {
    public static void main(String[] args) {
// Split: bir Stringi parçalara ayırmak demek

        // Kullanıcıdan alacağınız cumleyi kelimelerine göre alt alta yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("cümle = ");
        String cumle=oku.nextLine();

     String[] texts =   cumle.split(" ");

        for (int i = 0; i < texts.length ; i++) {
            System.out.println("texts = " + texts[i]);
        }
    }
}
