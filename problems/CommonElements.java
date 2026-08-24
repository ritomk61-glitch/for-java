package problems;

//  class labfile21 {
//     public static void main(String[] args) {
//         int[] nums = {11,22,33,44,55,66,77};

//   int max = nums[0];
//         for(int i = 0 ; i<nums.length;i++){
//             if(nums[i] > max){
//                 max = nums[i];
//             }
//             // System.out.println("your number index is " + i +" and number is : " + nums[i]);
//         }
//         System.out.println(max);
//     }
// }

// import java.util.*;

/**
 * labfile21
 */
// public class labfile21 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter number of characters:");

//         int n = sc.nextInt();
//         char[] arr = new char[n];
//         System.out.println("enter" + n + "characters:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.next().charAt(0);
//         }
//         System.out.println("array after removing duplication:");

//         for (int i = 0; i < n; i++) {
//             boolean duplication = false;
//             for (int j = 0; j < i; j++) {
//                 if (arr[i] == arr[j]) {
//                     duplication = true;
//                     break;
//                 }
//             }
//             if(!duplication){
//                 System.out.println(arr[i] + " ");
//             }
//         }
//         sc.close();

//     }
// }
// Find Common Elements Between Two Arrays

// public class CommonElements {
//     public static void main(String[] args) {
//         int[] arr1 = {1, 2, 3, 4, 5};
//         int[] arr2 = {3, 4, 5, 6, 7};

//         System.out.print("Common elements: ");
//         for (int i = 0; i < arr1.length; i++) {
//             for (int j = 0; j < arr2.length; j++) {
//                 if (arr1[i] == arr2[j]) {
//                     System.out.print(arr1[i] + " ");
//                 }
//             }
//         }
//     }
// }


/**
 * CommonElements
 */

// * reverse an arry

public class CommonElements {

    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};

        for(int i = arr.length-1 ; i >= 0 ; i--){
            System.out.println(arr[i]);
        }
    }
}