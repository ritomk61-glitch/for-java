import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your 1st num:");
        int a = sc.nextInt();
        System.out.println("enter your 2st num:");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("your sum is " + sum);

        sc.close();


    
    }
}
