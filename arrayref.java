package reference;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrayref {
    public static void main(String[] args) {
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println(" MyInt array = "+ Arrays.toString(myIntArray));
        System.out.println(" another array = "+Arrays.toString(anotherArray));

        anotherArray[0] = 10;

        System.out.println("After change MyInt array = "+ Arrays.toString(myIntArray));
        System.out.println("After change another array = "+Arrays.toString(anotherArray));

    }
}
