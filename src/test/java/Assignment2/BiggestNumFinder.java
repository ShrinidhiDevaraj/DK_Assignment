package Assignment2;
import java.util.Scanner;

public class BiggestNumFinder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int firstNum = sc.nextInt();
        System.out.println("Enter the 2nd number:");
        int secondNum = sc.nextInt();
        checkBigNum(firstNum,secondNum);

        sc.close();
    }

    public static void checkBigNum(int firstNum, int secondNum){

        if(firstNum>secondNum){
            System.out.println("First number " + firstNum + " is bigger than second number " + secondNum);
        }else if(secondNum>firstNum){
            System.out.println("Second number " + secondNum + " is bigger than first number " + firstNum);
        }else {
            System.out.println("Both numbers are equal" + firstNum + " and " + secondNum);
        }
    }
}
