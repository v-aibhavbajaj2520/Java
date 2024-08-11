import java.util.Scanner;

public class TaxCalculator{
    public static void main(String [] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the income: ");
        float income = sc.nextFloat();
        float tax = 0;
        if(income <= 1.8){
            tax = 0;
        }else if(income > 1.8 && income <= 3){
            tax = (float) (income * 0.05);
        }else if(income > 3 && income <= 5){
            tax = (float) (income * 0.1);
        }else if(income > 5 && income <= 10){
            tax = (float) (income * 0.2);
        }else if(income > 10){
            tax = (float) (income * 0.3);
        }
        System.out.println("Tax is : " + tax);
    }
}