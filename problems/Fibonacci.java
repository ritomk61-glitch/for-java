//! Write a Java program to calculate Simple Interest using variables and constants.

package problems;

// class labfile {

//     public static void main(String[] args) {
//         double p = 10000;
//         double r = 5;
//         double t = 2;
//         final double HUNDRED = 100;

//         double si = (p * r * t) / HUNDRED;

//         System.out.println("Simple Interest = " + si);
//     }
// }

// !Write a Java program to calculate the Area and Perimeter of a Rectangle using user input.

// import java.util.*;

// /**
//  * labfile
//  */
// class labfile {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter length:");
//         double l = sc.nextDouble();
//         System.out.println("enter breadth:");
//         double b = sc.nextDouble();

//         System.out.println("Area=" + (l * b));
//         System.out.println("perimeter = "+(2*(l+b)));
//         sc.close();
//     }

// }

// ! Write a Java program to find the Largest Among Three Numbers using if-else.

/**
 * labfile
 */
// class labfile {

//     public static void main(String[] args) {
//         int a = 20;
//         int b = 40;
//         int c = 60;

//         if (a > b && a > c) {
//             System.out.println("largest " + a);
//         } else if (b > a && b > c) {
//             System.out.println("largest" + b);
//         } else {
//             System.out.println("largest" + c);
//         }
//     }
// }

//& Write a Java program to implement a Menu-Driven Calculator using switch statement.

/**
 * labfile
 */
// import java.util.*;

// class labfile {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("1.sum \n2.subtraction\n3.multiplication\n4.division");

//         System.out.println("enter your choice:");
//         int ch = sc.nextInt();

//         System.out.println("enter your first value:");
//         int a = sc.nextInt();
//         System.out.println("enter your second value:");
//         int b = sc.nextInt();

//         switch (ch) {
//             case 1:
//                 System.out.println("your sum is = " + (a+b));
//                 break;
//             case 2:
//                 System.out.println("your subtraction is = " + (a-b));
//                 break;
//             case 3 :
//                 System.out.println("your multiplication is = "+ (a*b));
//                 break;
//                 case 4:
//                     System.out.println("your division is = " + (a/b));
//                     break;

//             default:
//                 System.out.println("default value");
//                 break;
//             }
//             sc.close();

//     }

// }

// !Write a Java program to generate the Fibonacci Series.

// import java.util.Scanner;

// public class Fibonacci {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of terms: ");
//         int n = sc.nextInt();

//         int a = 0, b = 1;

//         for (int i = 1; i <= n; i++) {
//             System.out.print(a + " ");
//             int c = a + b;
//             a = b;
//             b = c;
//         }

//         sc.close();
//     }
// }

// *Write a Java program to find the Factorial of a Number using loops.

// import java.util.*;

// /**
//  * Fibonacci
//  */
//  class Fibonacci {

//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter your number:");
//         int n = sc.nextInt();

//         int fact = 1;
//         for(int i = 1 ; i <= n ; i++){
//             fact *=i;
//         } 
//         System.out.println("factorial of " + " "+ n + " "+"is = " + fact );
//         sc.close();
//     }
// }

// *Write a Java program to print a Pyramid Star Pattern.

/**
 * Fibonacci
 */
class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}