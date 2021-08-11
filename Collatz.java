import java.util.Scanner;
public class Collatz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;
        number = scanner.nextInt();
        while (number!=1)
        {
            if (number%2 == 0)
            {
                number = number/2;
            }
            else number = ((3*number) + 1);
            System.out.println(number);
        }
    }
}