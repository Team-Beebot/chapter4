package chapters4;

import java.util.Scanner;

public class PalindromeFu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number you want:");
        int number = sc.nextInt();

        int check = number;
        int finalValue = checkPalindrome(number); // calling function.

        // retrive final value from checkPalindrome function.

        if(finalValue == check){
            System.out.println(number+" is a palindrome number.");
        }
        else{
            System.out.println(number+ " is not a palindrome number.");
        }









    }

    public static int checkPalindrome(int number){ // from user input
            int reverse = 0;


        while(number>0) {


            int rem = number % 10;//getting remainder
            reverse = (reverse * 10) + rem;
            number = number / 10;






        }
        return reverse;




    }

}
