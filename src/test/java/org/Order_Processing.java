package org;

import java.util.Scanner;

public class Order_Processing
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product name:");
        String product_name=sc.nextLine();
        System.out.println("Enter price:");
        int price= sc.nextInt();
        System.out.println("Enter quantity:");
        int quantity= sc.nextInt();

        if(quantity<=0 || price<=0 || product_name == null || product_name.isEmpty()){
            System.out.println("Invalid product name/price/quantity \n Enter proper value");
            sc.close();
            return;
        }

        int total = total_calculation(price,quantity);
        order_summary(product_name,price,quantity,total);

        sc.close();
    }

    public static int total_calculation(int price, int quantity){
        int total;

        total= price*quantity;

        return total;
    }

    public static void order_summary(String product_name,int price, int quantity,int total){
        System.out.println("Order Summary");
        System.out.println("Product name:" + product_name);
        System.out.println("Price:" +price);
        System.out.println("Quantity:" + quantity);
        System.out.println("total:" + total);
    }

}
