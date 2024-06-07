package Day15;

public class _02_JavaNestedLoop {
    public static void main(String[] args) {
        // 2 lerin çarpım tablosunu sormuştuk.
        // 2 x 1 =2
        // 2 x 2 =4
        // ....

        // 5(dahil) lere kadar halini yapınız


        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <=10 ; j++){
                System.out.println(i+ "x" + j + "=" + (i*j));
            }
            System.out.println();


        }
    }
}
