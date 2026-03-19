package practice;

<<<<<<< HEAD
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
=======

import java.util.*;

public class Main {
    public static void main(String[] args) {







        while (true) {

            //System.out.println(randomoutcome);
            Random random = new Random();
            List<String> outcomes = Arrays.asList("rock", "paper", "scissor");
            System.out.println("Rock ,Paper , Scissors ?");
            int index = random.nextInt(outcomes.size());
            String randomoutcome = outcomes.get(index);

            Scanner playerobj = new Scanner(System.in);
            String playerans = playerobj.nextLine().toLowerCase();



            //String again = "again";
            if (playerans.equals("exit")) {
                break;
            }
            if (randomoutcome.equals(playerans)) {
                System.out.println("draw");
            } else if (randomoutcome.equals("rock") && playerans.equals("paper")) {
                System.out.println("player wins");
            } else if (randomoutcome.equals("paper") && playerans.equals("rock")) {
                System.out.println("bot wins");
            } else if (randomoutcome.equals("paper") && playerans.equals("scissor")) {
                System.out.println("player wins");
            } else if (randomoutcome.equals("scissor") && playerans.equals("paper")) {
                System.out.println("bot wins");
            } else if (randomoutcome.equals("rock") && playerans.equals("scissor")) {
                System.out.println("bot wins");
            } else if (randomoutcome.equals("scissor") && playerans.equals("rock")) {
                System.out.println("player wins");
            } else {
                System.out.println("try again");
            }

        }









}}











































>>>>>>> 79ce5ae5df55fada9c4191ba8e854035a33eb6c4
