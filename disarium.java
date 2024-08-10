import java.util.Scanner;

public class disarium {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String num = scanner.next();
        int number = Integer.parseInt(num);
        int len = num.length();
        
        // Also Calculate number of digits as:
        // int len = 0
        // while (num > 0){
        //     num = num / 10;
        //     len++;
        // }

        int sum = 0;
        int num1 = number;
        while (number !=0){
            int rem = number % 10;
            sum = sum + (int)Math.pow(rem, len);  // (rem ** len)
            number = number / 10;
            len--;
        }
    

    if(sum == num1){
        System.out.println("Disarium Number");
    }
    else{
        System.out.println("Not a Disarium Number");
    }
    }
}
