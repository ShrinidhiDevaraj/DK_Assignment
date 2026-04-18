package Assignment2;
import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units consumed:");
        int unitsConsumed = sc.nextInt();
        if(unitsConsumed<0){
            System.out.println("Wrong value is entered, enter the proper value");
            return;
        }
        int powerBill = electricityBill(unitsConsumed);
        System.out.println("Electricity Bill: " + powerBill);

        sc.close();
    }

    public static int electricityBill(int unitsConsumed){
        int price;
        if(unitsConsumed<=100){
            price = unitsConsumed*5;
        }else if(unitsConsumed<=200){
            price = unitsConsumed*7;
        }else{
            price = unitsConsumed*10;
        }
        return price;
    }
}
