package chapters4;

import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int number1 = sc.nextInt();

        System.out.println("Enter another number:");
        int number2 = sc.nextInt();

        int result = addTwoNumber(number1, number2);
        System.out.println("The sum of your two number is: "+ result);


    }

    public static int addTwoNumber(int number1, int number2){
        return number1 + number2;

    }
}

