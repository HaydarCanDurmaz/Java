package Day07;

public class _05_StringSubstring {
    public static void main(String[] args) {

        // String in belli bir bölümünü alma işlemi

//                 012345678911121314
        String s1="Hello Everyone";


        String part1=s1.substring(3,9);// 3 nolu indexten 9 nolu indezse kadar
        System.out.println("part1 = " + part1);

        String part2=s1.substring(6,14);
        System.out.println("part2 = " + part2);

        String part3=s1.substring(6); // verilen den başlayıp sonuna kadar alır
        System.out.println("part3 = " + part3);

    }
}
