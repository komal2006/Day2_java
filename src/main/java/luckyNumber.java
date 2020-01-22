import java.util.*;
public class luckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter  n");
            n = sc.nextInt();
            if (n > 15)
                System.out.println("Please enter number between 1 to 15");
            if (n == 9) {
                System.out.println("Congratulations! you won");
                break;
            } else {
                if (i == 5) {
                    System.out.println("sorry, you are lost!");
                    continue;
                }
            }

        }

    }
}