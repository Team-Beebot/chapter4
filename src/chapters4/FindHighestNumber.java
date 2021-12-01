package chapters4;

import java.util.Scanner;

public class FindHighestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int number1 = sc.nextInt();

        System.out.println("Enter second number:");
        int number2 = sc.nextInt();

        System.out.println(" Enter third number:");
        int number3 = sc.nextInt();

        int highestNum = findHighestNumber(number1, number2, number3);
        System.out.println(highestNum+ " is a highest number.");


    }

    public static int findHighestNumber(int number1, int number2, int number3) {
        int heighest;
        if (number1 > number2 && number1 > number3) {
            heighest = number1;
        } else if (number2 > number1 && number2 > number3) {
            heighest = number2;

        } else {
            heighest = number3;
        }

        return heighest;

    }
}
