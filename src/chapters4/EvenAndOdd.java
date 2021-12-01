package chapters4;

import java.util.Scanner;

public class EvenAndOdd  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number you want check whether even or odd:");
        int number = sc.nextInt();

        int finalOutput = checkEvenOrOdd(number);
        if(finalOutput == 0){
            System.out.println(number+ " is an even number.");
        }
        else{
            System.out.println(number+ " is a odd number.");
        }

    }
    public static int checkEvenOrOdd(int number){
        int checkNumber;
        checkNumber = number%2;
        return checkNumber;
    }
}
