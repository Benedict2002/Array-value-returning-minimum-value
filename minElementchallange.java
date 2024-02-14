package reference;

import java.util.Scanner;


public class minElementchallange {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] readIntegers(int count) {
        int[] myArray = new int[count];
        System.out.println("Enter " + count + " integers: \r");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }
    public static int findMin(int[] arr){
        if(arr == null || arr.length == 0 ){
            throw new IllegalArgumentException("Array must not be empty or null");
        }
         int min = arr[0];

        for (int i =0; i<arr.length;i++){
           if(arr[i]< min) {
               min =arr[i];
           }

        }
        return  min;
    }

    public static void main(String[] args) {
        System.out.println("How many integers do you want to enter?\r");
        int count = scanner.nextInt();
        int[] elements = readIntegers(count);
        System.out.println("Elements entered:\r");
        for (int num : elements) {
            System.out.println(num);
        }
        int minm = findMin(elements);
        System.out.println("Minimum value is : "+ minm);
    }
}

