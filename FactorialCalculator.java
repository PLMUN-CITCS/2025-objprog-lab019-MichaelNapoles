import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args){
        int num = getNonNegativeInteger();
        System.out.println("The factorial of " + num + " is " + calculateFactorial(num));
        
    }

    public static int getNonNegativeInteger(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = input.nextInt();

        input.close();

        return num;

    }

    public static int calculateFactorial(int n){
        int factorial = 1;

        for (int i = 1; i <= n; i++){
            factorial *= i; 
        }

        return factorial;

    }
}