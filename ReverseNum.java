import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = scanner.nextInt();
        int reversenum = 0;
        
        while (num != 0) {
            int digit = num % 10;
            reversenum = reversenum * 10 + digit;
            num /= 10;        
        }

        System.out.println("The Reverse number is : " + reversenum);
        
        scanner.close();
    }
}
