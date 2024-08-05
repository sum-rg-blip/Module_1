package Challenge_Java;
import java.util.Scanner;
public class compoundInterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       final int interest=12*100;
       final int year=4;
        System.out.println("enter your amount:");
        int Amount=input.nextInt();
        int amount=Amount*interest;
        int finalValue=amount*year;
        System.out.println("final value :"+finalValue);
    }
}
