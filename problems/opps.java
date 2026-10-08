import java.util.*;

class opps {
    String name;
    int roll;
    String address;

    public void student(String name, int roll, String address) {
        this.name = name;
        this.roll = roll;
        this.address = address;
    }

    void show() {
        System.out.println(
                "hello your name is " + name + " and your roll is " + roll + "your system id is " + address);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("enter student no " + i + "details(name,roll,group:");

            System.out.println("enter your name:");
            String num = sc.nextLine();

            System.out.println("enter your roll:");
            int rol = sc.nextInt();
            
            sc.nextLine();

            System.out.println("etner your address:");
            String add = sc.nextLine();

            opps s = new opps();

            s.student(num,rol,add);
            s.show();
        }
        
        sc.close();
    }
}
