package practice;

public class Main2 {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        int[] arr = {5, 8, 2, 7, 4};
        int[] arr2 = {1, 2, 4, 5, 6};

        // Print first array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println();

        // Print second array
        for (int k = 0; k < arr2.length; k++) {
            System.out.println(arr2[k]);
        }

        // Reverse first array
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // Print reversed array
        System.out.println("Reversed arr:");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}