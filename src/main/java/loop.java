import java.util.*;
public class loop {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

//        int n;
//        System.out.println("Enter  n");
//        n=sc.nextInt();
        System.out.println("Print Sequence of even numbers:");
        for(int i=2; i<=10; i++)
        {
            if (i % 2 == 0)
            {
                if(i!=8)
                    System.out.println("Square of:" + i + " is " + i*i);

            }

        }




    }
}
