package Assignment2;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        double firstNum = sc.nextDouble();
        System.out.println("Enter the 2nd number:");
        double secondNum = sc.nextDouble();

        double addition = addition(firstNum,secondNum);
        System.out.println("Addition of 2 numbers:" + addition);
        double subtraction = subtraction(firstNum,secondNum);
        System.out.println("Subtraction of 2 numbers:" + subtraction);
        double multiplication = multiplication(firstNum,secondNum);
        System.out.println("Multiplication of 2 numbers:" + multiplication);
        double division = division(firstNum,secondNum);
        System.out.println("Division of 2 numbers:" + division);

        sc.close();
    }

    public static double addition(double firstNum, double secondNum){
        return firstNum + secondNum;
    }

    public static double subtraction(double firstNum, double secondNum){
        return firstNum - secondNum;
    }
    public static double multiplication(double firstNum, double secondNum){
        return firstNum * secondNum;
    }
    public static double division(double firstNum, double secondNum){
        if(secondNum !=0){
            return firstNum / secondNum;
        }else{
            System.out.println("Division by zero is not allowed");
            return 0;
        }

    }
}
