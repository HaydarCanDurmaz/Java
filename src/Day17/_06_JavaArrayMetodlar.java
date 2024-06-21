package Day17;

import java.util.Arrays;

public class _06_JavaArrayMetodlar {
    public static void main(String[] args) {
        String[] names = { "zorbey","kayhan","erhan","ferhat"};

        System.out.println("names = " + Arrays.toString(names));

        Arrays.sort(names);
        System.out.println("names = " + Arrays.toString(names));

        int[] a= {1,2,3,4,5};
        int[] b= {1,2,3,4,5};
        int[] c= {6,7,3,4,5};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b));
        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(a,c));

        Arrays.sort(c);
        System.out.println("c  = " + Arrays.toString(c));

        Arrays.sort(b);
        System.out.println("b  = " + Arrays.binarySearch(b,5));
    }
}
