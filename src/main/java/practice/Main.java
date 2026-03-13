package practice;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");


        int[] arr = {5,8,2,7,4};
        int[] arr2 = {1,2,4,5,6};

        for(int i = 0 ; i < arr.length ; i ++){
            System.out.println(arr[i]);

            }
        System.out.println(" ");
        for(int k = 0 ; k < arr2.length ; k ++){
            System.out.println(arr2[k]);
        }

    int start = 0 ; //start is the first index
    int end = arr.length - 1; //points to last element

    while (start < end) { //Loop runs as long as start is less than end
        int saving_first_element = arr[start]; //save first element in temp
        arr[start] = arr[end]; //move last element to first position
        arr[end] = saving_first_element; //put saved first element at last position

        start++;
        end--;


    }
        System.out.println("reveresd arr");
    for(int j = 0 ; j<arr.length;j++){
        System.out.println(arr[j]);
    }

    }
}