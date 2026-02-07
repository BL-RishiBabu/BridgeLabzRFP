package JavaProgrammingConstruct.dayTwo;

import java.util.Scanner;

public class sumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sum of n natural numbers");
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        int answer = 0;

        int i = 1;
        while (i <= number) {
            answer += i;
            i++;
        }

        System.out.println("The sum of natural number till "+ number +" is "+ answer);
        sc.close();
    }
}
