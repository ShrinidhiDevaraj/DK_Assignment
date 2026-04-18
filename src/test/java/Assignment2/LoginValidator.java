package Assignment2;

import java.util.Scanner;


public class LoginValidator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username:");
        int username = sc.nextInt();
        System.out.println("Enter password:");
        int password = sc.nextInt();

        boolean isValid = validatelogin(username,password);

        if(isValid){
            System.out.println("Login Successful");
        } else{
            System.out.println("Invalid Credentials");
        }
        sc.close();
    }

    public static boolean validatelogin(int username,int password){
        int correct_user = 123;
        int correct_password = -123;

        boolean isValid = false;

        if(username == correct_user && password == correct_password){
            isValid = true;
        }

        return isValid;
    }
}