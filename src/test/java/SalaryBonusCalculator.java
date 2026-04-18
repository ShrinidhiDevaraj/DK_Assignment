package Assignment2;
import java.util.Scanner;

public class SalaryBonusCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary to calculate the bonus:");
        double salary = sc.nextDouble();
        bonusCalculation(salary);

        sc.close();
    }

    public static void bonusCalculation(double salary){
        double bonus = 0;
        if(salary>50000){
            bonus= salary * 0.20;
        }else if(salary <=50000 && salary >= 30000){
            bonus = salary * 0.10;
        }else if(salary < 30000){
            bonus = salary * 0.05;
        }
        displaybonus(bonus,salary);
    }

    public static void displaybonus(double bonus,double salary){
        System.out.println("Bonus is " + bonus + " for the salary " + salary);
    }
}
