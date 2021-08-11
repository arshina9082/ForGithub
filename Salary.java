package com.company;
import java.util.Scanner;
public class Salary {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] hours = new int[7];
        int totalhours=0, totalsalary=0;
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<7; i++)
        {
            hours[i] = scanner.nextInt();
        }
        for(int i=1; i<=5; i++)
        {
            totalhours += hours[i];
        }
        for(int i=1; i<=5; i++)
        {
            if (hours[i]<=8)
            {
                totalsalary += (hours[i] * 100);
            }
            else{
                totalsalary += (800 + ((hours[i]-8) * 115));
            }
        }

        if (totalhours > 40)
        {
            totalsalary += ((totalhours-40) * 125);
        }
        if (hours[0] > 0)
        {
            totalsalary += ((hours[0] * 100) * 0.25);
        }
        if (hours[6] > 0)
        {
            totalsalary += ((hours[0] * 100) * 0.5);
        }

        System.out.println(totalsalary);
    }
}