package Assignment2;
import java.util.Scanner;

public class TemperatureChecker {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature:");
        int temp = sc.nextInt();
        temperatureCheck(temp);

        sc.close();
    }

    public static void temperatureCheck(int temp){
        if(temp>30){
            System.out.println("Temperature is hot " + temp);
        }else if(temp>=15){
            System.out.println("Temperature is normal " + temp);
        }else {
            System.out.println("Temperature is cold " + temp);
        }

    }
}
