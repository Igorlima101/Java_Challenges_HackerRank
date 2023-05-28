package easy.challenges;

import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {

        /*
        Input Format

        There are three lines of input:

        The first line contains an integer.
        The second line contains a double.
        The third line contains a String.
        Output Format

        There are three lines of output:

        On the first line, print String: followed by the unaltered String read from stdin.
        On the second line, print Double: followed by the unaltered double read from stdin.
        On the third line, print Int: followed by the unaltered integer read from stdin.
        To make the problem easier, a portion of the code is already provided in the editor.
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            int g = String.valueOf(x).length();
            int s = s1.length();
            String result = s1;

            for(int j = s; j < 15; j++) {
                result += " ";
            }
            if (g == 1) {
                result += "00" + x;
            } else if ( g == 2) {
                result += "0"+x;
            }else {
                result+=x;
            }

            result += " ";

            System.out.println(result);
        }
        System.out.println("================================");

    }
}
