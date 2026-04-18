package Assignment2;
import java.util.Scanner;

public class StudentPassOrFail {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student's marks:");
        int marks = sc.nextInt();
        if(marks < 0 || marks > 100){
            System.out.println("Enter the proper value");
            return;
        }
        passOrFail(marks);

        sc.close();
    }

    public static void passOrFail(int marks){
        if(marks >= 40){
            System.out.println("Student has Passed");
        }else{
            System.out.println("Student has Failed");
        }
    }
}
