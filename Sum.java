import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, selected_number, even=0, odd=0;
        number = sc.nextInt();
        while(number>0)
        {
            selected_number = number%10;
            if (selected_number%2 == 0)
            {
                even += selected_number;
            }
            else {
                odd += selected_number;
            }
            number = number/10;
        }
        if (even == odd)
        {
            System.out.println("Probable Topper Number");
        }
        else System.out.println("Not a Probable Topper Number");
    }
}