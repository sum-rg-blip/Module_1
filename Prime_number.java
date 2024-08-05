package Challenge_Java;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number N: ");
        int numberN=input.nextInt();
        final int NUMBER_OF_PRIMES = 50;
        int count=0;
        while (count < NUMBER_OF_PRIMES) {
            // Assume the number is prime
            boolean isPrime = true;
            for (int divisor = 2; divisor <= numberN / 2; divisor++) {
                if (numberN % divisor == 0) {
                    isPrime = false; // Set isPrime to false
                    break;// If true, number is not prime

                }

            }
        }
    }
}
