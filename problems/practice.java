import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name for reverse your name:");
        // String name = "Ritom";
        String name = sc.nextLine();
        String rev= " ";

        for (int i = name.length()-1; i>=0 ; i--){
            rev = rev + name.charAt(i);
            // System.out.println(name.charAt(i));
        }
        System.out.println("the reverse name of " + name + " " + "is" + rev);
    }
}
