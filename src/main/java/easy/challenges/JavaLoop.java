package easy.challenges;

import java.util.Scanner;

public class JavaLoop {
    public static void main(String[] args) {
        /*
        Task
        Given an integer, print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.
         */
        Scanner scan = new Scanner(System.in);

        int userNumber = scan.nextInt();

        for(int i = 1; i <= 10; i++){
            int result = userNumber * i;

            System.out.println(userNumber + " x " + i + " = " + result);
        }
    }
}
