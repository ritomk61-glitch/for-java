// public class Conditi {
//     public static void main(String[] args) {
//         for (int m = 1; m <= 10; m++) {
//             System.out.println("Table of " + m + ":");
//             for (int i = 1; i <= 10; i++) {
//                 System.out.println(m + " * " + i + " = " + (m * i));
//             }
            
//         }
//     }
// }
// public class Conditi {
//     public static void main(String[] args) {
//         for (int m = 1; m <= 10; m++) {
//             System.out.println("Table of " + m + ":");
//             for (int i = 1; i <= 10; i++) {
//                 System.out.println(m + " * " + i + " = " + (m * i));
                
//             }
//             System.out.println(); 
//         }
//     }
// }

/**
 * Conditi
 */
// import java.util.*;
// public class Conditi {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your number:");
//         int n = sc.nextInt();

//         int sum = 0;
//         for(int i = 1 ; i <=n ; i++){
//             sum+=i;
//         }
//         System.out.println("sum of the natural number of 1-"+n+"=22" +sum);
//         sc.close();
//     }
// }

/**
 * Conditi
 */
public class Conditi {
    public static void main(String[] args) {
        for(int i =  1 ; i <= 5 ; i++){          // outer loop controls rows
            for( int j = 1 ; j<=i ; j++){        // inner loop controls stars per row
                System.out.println("* ");        // prints a star
            }
            System.out.println();                // moves to next line
        }
    }
}
