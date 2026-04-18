package Assignment2;
import java.util.Scanner;

public class NumberOperationSelector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        double firstNum = sc.nextDouble();
        System.out.println("Enter the 2nd number:");
        double secondNum = sc.nextDouble();
        System.out.println("Operation codes are: \n 1 -> Addition \n 2 -> Subraction \n 3-> Multiplication \n 4-> Division");
        System.out.println("Enter the operation code to perform an operation:");
        int operationCode = sc.nextInt();
        if(operationCode<1 || operationCode>4){
            System.out.println("Operation code is wrong, enter proper value");
            return;
        }
        operationsOnNumber(firstNum,secondNum,operationCode);

    }

    public static void operationsOnNumber(double firstNum, double secondNum,int operationCode){
        double result;
        if(operationCode == 1){
            result = firstNum + secondNum;
            System.out.println("Operation performed is addition, result is " + result);
        }else if(operationCode == 2){
            result = firstNum - secondNum;
            System.out.println("Operation performed is subtraction, result is " + result);
        }else if(operationCode == 3){
            result = firstNum * secondNum;
            System.out.println("Operation performed is multiplication, result is " + result);
        }else if(operationCode == 4){
            if(secondNum != 0){
                result = firstNum / secondNum;
                System.out.println("Operation performed is division, result is " + result);
            }else{
                System.out.println("Division by zero is not allowed");
            }

        }
    }
}
