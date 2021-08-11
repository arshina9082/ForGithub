package com.company;
import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int n = scanner.nextInt();

        if (x == n){
            System.out.println("First lab can be allocated");
        }else if (y == n)
        {
            System.out.println("Second lab can be allocated");
        }else if (z == n)
        {
            System.out.println("Third lab can be allocated");
        }else if (((x-n)<(y-n)) && ((x-n)<(z-n)))
        {
            System.out.println("First lab can be allocated");
        }else if (((y-n)<(x-n)) && ((y-n)<(z-n)))
        {
            System.out.println("Second lab can be allocated");
        }else if (((z-n)<(x-n)) && ((z-n)<(y-n)))
        {
            System.out.println("Third lab can be allocated");
        }
        else
        {
            System.out.println("No lab can be allocated");
        }


    }

}
