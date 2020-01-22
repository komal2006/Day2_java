import java.util.*;
public class fibonaciiSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 15, t1 = 1, t2 = 1;
        System.out.print("First 15 terms: ");
     System.out.print(t1+" "+t2+" ");
        for (int i = 3; i <= n; ++i)
        {

           // System.out.print(t1 + "  ");

            int sum = t1 + t2;
            System.out.print(sum + " ");
            t1 = t2;
            t2 = sum;

        }


    }
}
