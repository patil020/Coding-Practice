package Patterns;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();

        System.out.println("Right-aligned triangle using nested do-while loops:\n");

        int i = 0;
        do {
            int j = 0;
            int spaces = row - i;
            do {
                System.out.print(" ");
                j++;
            } while (j < spaces);

            int k = 0;
            do {
                System.out.print("*");
                k++;
            } while (k <= i);

            System.out.println();
            i++;
        } while (i < row);

        sc.close();
    }
}
