import java.util.Arrays;
import java.util.Scanner;
public class Reduce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int steps = 0;
        while (n != 0){
            if (n % 2 == 0){
                n = n / 2;
            } else {
                n = n - 1;
            }
            steps += 1;
        }
        System.out.println("It took you " + steps + " steps to reach 0.");
    }
}
