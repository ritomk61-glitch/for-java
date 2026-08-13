import java.util.*;

/**
 * othentication
 */
public class othentication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter your username:");
        String username = sc.nextLine();

        System.out.println("enter your pass:");
        String pass = sc.nextLine();

        if( username.equals("motki") && pass.equals("123")){
              System.out.println("login successfull");
        }
        else{
            System.out.println("invalid username and password.try again");
        }
        sc.close();


    }
}
