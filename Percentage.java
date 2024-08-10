import java.util.Scanner;

public class Percentage{
    public static void main(String [] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 5 subjects: ");
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        float d = sc.nextInt();
        float e = sc.nextInt();
        float percent = (a + b + c + d + e)/5;
        System.out.println("Percentage is : " + percent);
    }
}