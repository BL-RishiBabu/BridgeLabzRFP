package JavaProgrammingConstruct.dayTwo;

import java.util.Scanner;

public class palindromeNumber {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check the number is palindrome or not");

        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        int coppyNumber = number;

        int answer = 0;
        for (int i = 0; i <= coppyNumber; i++) {
            int digit = number % 10;
            answer = answer * 10 + digit;
            number /= 10;
            if (number == 0) break;
        }

        System.out.println((coppyNumber == answer) ? "It is Palindrome number" : "It is not a Palindrome number");
        sc.close();
    }
}
