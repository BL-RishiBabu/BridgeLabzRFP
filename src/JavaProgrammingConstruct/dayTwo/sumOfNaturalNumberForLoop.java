package JavaProgrammingConstruct.dayTwo;

import java.util.Scanner;

public class sumOfNaturalNumberForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sum of n natural numbers");

        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        int answer = 0;

        for (int i = 0; i <= number; i++) answer += i;

        System.out.println("The sum of natural number till "+ number +" is "+ answer);
        sc.close();
    }
}
