package obr;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExampleMain
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(a/b);
        } catch (ArithmeticException e){
            System.err.println(e.getLocalizedMessage());
            System.err.println("You are stupid!!");
        }catch (InputMismatchException e){
            System.err.println("Error!!");
        }



    }
}
