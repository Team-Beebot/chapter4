package chapters4;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for display that particular multiplication table:");
        int tableNumber = sc.nextInt();
        int finalOutput = multiplicationTable(tableNumber);
        System.out.printf("%d \n",finalOutput);




    }
    public static int multiplicationTable(int tableNumber){ //taking tablenumber value from above function.call

            int finalResult =0;

        for(int i = 1; i<=10; i++){

            finalResult = tableNumber * i;


        }
        return finalResult;






    }
}
