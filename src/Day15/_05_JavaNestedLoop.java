package Day15;

public class _05_JavaNestedLoop {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *
        // **
        // ***
        // ****
        // *****
        // *****
        // ****
        // ***
        // **
        // *

        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < j; i++) {
                System.out.print("*");

            }
            System.out.println();

        }
        for (int j = 5; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
