package org;

import java.util.Scanner;


public class Login {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username:");
        String username = sc.nextLine();
        System.out.println("Enter password:");
        String password = sc.nextLine();

        boolean isVaild = validatelogin(username,password);

        if(isVaild){
            System.out.println("org.Login Successful");
        } else{
            System.out.println("org.Login Failed");
        }
        sc.close();
    }

    public static boolean validatelogin(String username,String password){
        String correct_user = "admin";
        String correct_password = "admin123";

        boolean isValid = false;

        if(username.equals(correct_user) && password.equals(correct_password)){
            isValid = true;
        }

        return isValid;
    }
}