package Challenge_Java;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number N: ");
        int numberN=input.nextInt();
        int count = 0;
        int num = 2;
        System.out.println("First " + numberN + " prime numbers are:");
        while (count < numberN) {
                boolean isPrime = true;
                    for (int i = 2; i <= Math.sqrt(num); i++) {
                        if (num % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        System.out.print(num + " ");
                        count++;
                    }
                    num++;
                }

    }
}
