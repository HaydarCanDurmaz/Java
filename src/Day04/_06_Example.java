package Day04;

public class _06_Example {
    public static void main(String[] args) {
        // Kişinin ağırlığını double, boyunu int olarak değerler veriniz.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız  kg / (boy*boy)

        double heaving = 98.90;
        int length = 180;

        double bodymass = heaving / (length*length);

        System.out.println("bodymass = " + bodymass);


        /*************************************/

        double heaving1 = 98.90;
        double length1 = 1.80;

        double bodymass1 = heaving / (length*length);

        System.out.println("bodymass1 = " + bodymass1);
    }
}
