package JavaProgrammingConstruct.dayTwo;

import java.util.Scanner;

public class ReverseNumberForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Reversing the integer");

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

        System.out.println("The reversed integer is : "+ answer);
        sc.close();
    }
}