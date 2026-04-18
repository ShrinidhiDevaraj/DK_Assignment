package Assignment2;
import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is even or odd:");
        int Num = sc.nextInt();
        checkEvenOrOdd(Num);

        sc.close();
    }

    public static void checkEvenOrOdd(int num){
        if(num%2 == 0){
            System.out.printf("Given number is even:" + num);
        }else {
            System.out.println("Given number is odd:" + num);
        }
    }
}
