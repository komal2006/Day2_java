import java.util.*;
public class totalSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        // double salary, target, commission ;
        System.out.println("Enter the sales target:");
        double target = sc.nextDouble();
        double sum = 0, commission;
        for (int i = 1; i <= 7; i++) {
            System.out.println("Enter the employee salary:");
            double salary = sc.nextDouble();
            System.out.println(" Enter the employees sales amount:");
            double salesAmount = sc.nextDouble();
            if (salesAmount >= target)
                commission = 0.05 * salesAmount;
            else if(salesAmount >= target * 0.8)
                 commission = 0.03 * salesAmount;
            else
                commission = 0.01 * salesAmount;

            double total = salary + commission;
            System.out.println("The total salary of this employee is:" + total);
            sum += total;


        }
        double average = sum / 7;
        System.out.println("Average is :" + average);


    }








    }

