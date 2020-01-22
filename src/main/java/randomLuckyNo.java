import java.util.Random;
import java.util.Scanner;

public class randomLuckyNo {

        public static void main (String[] args)
        {

            Scanner sc = new Scanner(System.in);
            int n;
            Random generator = new Random();
            int lucky;

            // Generate lucky1 (a random integer between 1 and 15) using the nextInt method

            lucky = generator.nextInt(14)+1;
            System.out.println ("Your lucky numbers are " + lucky );
            for (int i = 1; i <= 5; i++) {
                System.out.println("Enter  n");
                n = sc.nextInt();
                if (n > 15)
                    System.out.println("Please enter number between 1 to 15");
                if (n == lucky) {
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

