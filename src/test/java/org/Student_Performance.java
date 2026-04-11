package org;

import java.util.Scanner;

public class Student_Performance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st subject mark:");
        int sub1=sc.nextInt();
        System.out.println("Enter 2nd subject mark::");
        int sub2= sc.nextInt();
        System.out.println("Enter 3rd subject mark::");
        int sub3= sc.nextInt();

        if(sub1<=0 || sub1 > 100 || sub2<=0 || sub2 > 100 || sub3<=0 || sub3 > 100){
            System.out.println("Invalid mark \n Enter proper value");
            sc.close();
            return;
        }

        int total = performace(sub1,sub2,sub3);
        int average = total/3;

        if(average>=70 && average <=100){
            System.out.println("Student performance is good");
        } else if (average>=50) {
            System.out.println("Student performance is average");
        } else {
            System.out.println("Student performance is poor");
        }

        sc.close();
    }


    public static int performace(int sub1,int sub2, int sub3){
        int total=0;

        total = sub1+sub2+sub3;

        return total;
    }
}
