package chapters4;

import java.util.Scanner;

public class SumOfRangeOfEvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int number1 = sc.nextInt();

        System.out.println("Enter second number:");
        int number2 = sc.nextInt();

        int finalOutput = sumOfEven(number1, number2);
        System.out.println(finalOutput+" is the sum of all possible even number between two number you input.");





    }
    public static int sumOfEven(int number1, int number2){
        int collectEven = 0; // initialize the collecteven
        for(int i=number1; i<number2; i++){
            if(i%2 == 0){
                collectEven = collectEven+i; //where we can actually adding up all possible even number between number1 and number2.
            }

        }
        return collectEven;

    }
}
