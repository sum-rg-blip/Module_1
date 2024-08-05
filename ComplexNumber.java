package Challenge_Java;
import java.util.Scanner;
public class ComplexNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number1 :");
        int number1=input.nextInt();
        System.out.println("Enter your number2 :");
        int number2= input.nextInt();
        int total=number1+number2;
        int subtract = number1-number2;
        int divide =number1/number2;
        int mult=number1*number2;
        System.out.println("Add :"+ total);
        System.out.println("Subtract :" + subtract);
        System.out.println("Divide :" + divide);
        System.out.println("Multi :"+mult);
    }
}
