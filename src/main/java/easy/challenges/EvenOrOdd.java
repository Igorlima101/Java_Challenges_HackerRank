package easy.challenges;


import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        /*Task
        Given an integer, , perform the following conditional actions:
        If  is odd, print Weird
        If  is even and in the inclusive range of  to , print Not Weird
        If  is even and in the inclusive range of  to , print Weird
        If  is even and greater than , print Not Weird
        Complete the stub code provided in your editor to print whether or not  is weird.
         */

        Scanner scan = new Scanner(System.in);
        int number;

        System.out.println("Write a number");
        number = scan.nextInt();

        if(number % 2 == 0){
            if(number > 1 && number < 6){
                System.out.println("Not Weird");
            }
            else if(number > 6 && number <= 20){
                System.out.println("Weird");
            }
            else if(number > 20){
                System.out.println("Not Weird");
            }
        }

        else{
            System.out.println("Weird");
        }
    }
}
