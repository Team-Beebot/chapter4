package chapters4;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle:");
        double principle = sc.nextFloat();

        System.out.println("Enter time:");
        double time = sc.nextFloat();

        System.out.println("Enter Rate:");
        double rate = sc.nextFloat();

        double interest = simpleInterest(principle, time, rate);
        System.out.println("Your interest amount is: "+ interest);



    }
    public static double simpleInterest(double principle, double time, double rate){

        return (principle * time * rate)/100;


    }
}
