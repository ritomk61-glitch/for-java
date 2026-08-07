/**
 * p1
 */
// public class p1 {

//      public static void main(String[] args) {
//         int n = 10 ;
//         if(n > 0){
//             System.out.println("number is positive");
//         }
    
//         System.out.println("program end");
//      }
// }

/**
 * p1
 */

// import java.util.*;
// ;

// ! odd even 

// public class p1 {

//     public static void main(String[] args) {
//         int counte = 1;
//         int counto = 1;
//        for ( int i = 1 ; i <=100 ; i++){
//            if(i % 2 == 0){
//                System.out.println("even--" + i);
//                counte++;
//            }
//            else{
//             System.out.println("odd--" + i);
//             counto++;
//            }
//        }
//        System.out.println("number of even=" + counte);
//        System.out.println("number of odd=" + counto);
//     }
//     }

// ! multiple if else

    /**
     * p1
     */
    import java.util.*;
    // public class p1 {
    
    //     public static void main(String[] args) {

    //         Scanner sc = new Scanner(System.in);
    //         System.out.println("enter your age:");
    //         int age = sc.nextInt();
    //         // int age =33;
    //         if(age < 13){
    //             System.out.println("child");
    //         }
    //         else if(age < 20){
    //             System.out.println("teenager");
    //         }
    //         else if(age < 60){
    //             System.out.println("adult");
    //         }
    //         else{
    //             System.out.println("senior citizen");
    //         }
    //         sc.close();
    //     }

    // }

    // ! check login access

    /**
     * p1
     */
    public class p1 {
    
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("enter your username :");
            String username = sc.nextLine();
            String pass = "rk123";

            if (username.equals("ritom")){
                if(pass.equals("rk123")){
                    System.out.println("welcome login successful");
                }
            }
            else{
                System.out.println("incorrect password");
            }
            sc.close();
        
           
        }
    }