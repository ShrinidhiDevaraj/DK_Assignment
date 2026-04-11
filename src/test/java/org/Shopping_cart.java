package org;

import java.util.Scanner;

public class Shopping_cart {

    public static void main(String[] args){
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

        display_product(product_name,price,quantity);

        int total = total_calculation(price,quantity);

        System.out.println("Checkout\n Order Placed successfully");
        System.out.println("Total amount:" + total);

    }

    public static void display_product(String product_name,int price, int quantity){
        System.out.println("Product details");
        System.out.println("Product: " + product_name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);

    }

    public static int total_calculation(int price, int quantity){
        int total;

        total= price*quantity;

        return total;
    }
}
