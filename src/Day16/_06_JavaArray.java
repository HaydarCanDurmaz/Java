package Day16;

public class _06_JavaArray {
    public static void main(String[] args) {
        // TODO : gunun sorusu : bir döngü ile 5 tane rastgele buldurunuz
        // TODO : fakat bir buldunu tekrar bulmasın


        String[] televizyon = {"TRTtv", "Kanal D ", "ATV", "FOX", "HaberTürk"};
        int rasgele = (int) (Math.random() * televizyon.length);
        for (int i = 0; i < televizyon.length; i++) {


            if (televizyon[rasgele] != televizyon[rasgele]) {
                System.out.println("ATV");
                break;
            } else if (televizyon[rasgele] != televizyon[rasgele]) {
                System.out.println("FOX");
                break;
            } else if (televizyon[rasgele] != televizyon[rasgele]) {
                System.out.println("TRTtv");
                break;
            } else if (televizyon[rasgele] != televizyon[rasgele]) {
                System.out.println("HaberTürk");
                break;


            }

            System.out.println("televizyon = " + televizyon[rasgele]);

            //     System.out.println("Rasgele Secilen Tv = >" + televizyon[rasgele]);
        }
    }
}