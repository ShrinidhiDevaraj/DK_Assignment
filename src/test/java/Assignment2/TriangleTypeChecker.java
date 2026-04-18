package Assignment2;
import java.util.Scanner;

public class TriangleTypeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st side:");
        int side1 = sc.nextInt();
        System.out.println("Enter the 2nd side:");
        int side2 = sc.nextInt();
        System.out.println("Enter the 3nd side:");
        int side3 = sc.nextInt();
        if(side1 <=0 || side2 <=0 || side3 <=0){
            System.out.println("Given sides are not correct, enter proper value");
            return;
        }
        TriangleType(side1,side2,side3);
    }

    public static void TriangleType(int side1, int side2, int side3){

        if(side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1){
         System.out.println("Given sides can't form a triangle");
        }else if(side1 == side2 && side2 == side3){
            System.out.println("Given triangle is Equilateral");
        }else if(side1 == side3 || side2 == side3 || side1 == side2){
            System.out.println("Given triangle is Isosceles");
        }else{
            System.out.println("Given triangle is Scalene");
        }
    }
}
