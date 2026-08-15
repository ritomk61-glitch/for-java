// !Find the Largest and Smallest Digit of a Number
// import java.util.*;
// public class Lav{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your number:");
//         int n = sc.nextInt();

//         int Largest = 0;
//         int Smallest = 9;

//         while( n > 0){
//           int digit = n % 10 ; 
//           if(digit > Largest){
//               Largest = digit;
//             }
//             if(digit < Smallest){
//                 Smallest = digit;
//             }
//             n = n / 10;
//         }
//         System.out.println("largest digit " + Largest);
//         System.out.println("Smallest digit " + Smallest);

//         sc.close();
//     }
// }

// !Find the Fourth Largest Digit in a given Number 2891345

// import java.util.Scanner;

// public class Lav {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);  
//         System.out.print("Enter N: ");
//         int n = scanner.nextInt();
//         System.out.println("Perfect numbers:");
//         for (int i = 1; i <= n; i++) {
//             int sum = 0;
//             for (int j = 1; j < i; j++) {
//                 if (i % j == 0) {
//                     sum += j;
//                 }
//             }
//             if (sum > 0 && sum == i) {
//                 System.out.print(i + " ");
//             }
//         }
//         System.out.println();

//         scanner.close();
//     }
// }

// public class Lav {
//     public static void main(String[] args) {
//         int num = 2891345;
//         int[] digits = new int[10];

//         while (num > 0) {
//             digits[num % 10]++;
//             num /= 10;
//         }

//         int count = 0;

//         for (int i = 9; i >= 0; i--) {
//             if (digits[i] > 0) {
//                 count++;

//                 if (count == 4) {
//                     System.out.println("Fourth largest digit: " + i);
//                     break;
//                 }
//             }
//         }
//     }
// }
//  public class Lav {
//     public static void main(String[] args) {
//         int num = 2891345;
//         int sum = 0;

//         while (num > 0) {
//             int digit = num % 10;

//             if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
//                 sum += digit;
//             }

//             num /= 10;
//         }

//         System.out.println("Sum of prime digits: " + sum);
//     }
// }

/**
 * Main
 */


// public class Lav {

//     public static void main(String[] args) {
//         int arr[] = { 11, 33, 44, 55, 66, 77 };
//         System.out.println("latest for loop");
//         for (int i : arr) {
//             System.out.println(i);
//         }
//         System.out.println("traditional for loop");
//         for (int i = 0; i <= arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }
// }


import java.util.*;

/**
 * Lav
 */
public class Lav {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your number:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter array value:");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];

        for(int num:arr){
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }
        System.out.println("largest number:" + max);
        System.out.println("minium number:" + min);
        sc.close();
        
    }
    
}