package JavaProgrammingConstruct.dayTwo;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Reversing the integer");

        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        int answer = 0;
        while (number != 0) {
            int digit = number % 10;
            answer = answer * 10 + digit; 
            number = number / 10;
        }

        System.out.println("The reversed integer is : "+ answer);
        sc.close();
    }
}
