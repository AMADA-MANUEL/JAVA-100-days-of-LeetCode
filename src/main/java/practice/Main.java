package practice;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");


        int[] arr = {5, 8, 2, 7};
//3. Traversing an Array
//
//Traversing means visiting every element.
        //What i < arr.length Means
        //This condition means:
        //Keep looping while i is smaller than the array size.
        for(int i = 0 ; i<arr.length; i ++){
            System.out.println(arr[i]);
        }






        for(int num : arr) {
            System.out.println(num);
        }







    }
}