import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Enter your age = ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        System.out.println("Your Age is = "+age);

        if( age < 18) {
            if(age > 11){
                System.out.println("You can login to Voot Kids");
            }
            else{
                System.out.println("Oops ... You are not eligible for this subscription !!! ");
            }
        }
        else if (age >= 18 && age < 30){
            System.out.println("Wohhoo ... You can login to Netflix ;-) ");
        }
        else{
            System.out.println("You can login to Discovery Channel");
        }
    }
}
