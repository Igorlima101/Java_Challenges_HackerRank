package easy.challenges;

import java.util.Scanner;

public class InputScannerValues {
    public static void main(String[] args) {

        //Show all values storage in var scanners

        Scanner scan = new Scanner(System.in);
        int a,b,c;

        System.out.println("First number");
        a = scan.nextInt();

        System.out.println("Second number");
        b = scan.nextInt();

        System.out.println("Third number");
        c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
