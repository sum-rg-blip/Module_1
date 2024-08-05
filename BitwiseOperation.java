package Challenge_Java;

import java.util.Scanner;

public class BitwiseOperation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number1:");
        int number1=input.nextInt();
        System.out.println("Enter your number2:");
        int number2=input.nextInt();
        System.out.println("And bitwise operation number1&number2 = " + (number1 & number2));
        System.out.println("Or bitwise operation number1|number2 = " + (number1 | number2));
        System.out.println("Not bitwise operation number1^number2 = " + (number1 ^ number2));

    }
}
