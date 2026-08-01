/**
 * lavfile
 * 
 */
/**
 * Innerlavfile
*/

// public class lavfile {

// interface a {
    
//     void show();
// }

// interface b {
//         void display();    
//     }
    
    
//     class C implements a , b {
//         public void show(){}
//         public void display(){
//             System.out.println("interface b method");
//         }
//     }
    
    
//     public static void main(String[] args) {
//         C nh = new C();
//         nh.show();
//         nh.display();
//     }
// }

class Methodoverloading{
    public void m1(){System.out.println("No Args");
    }
    public void m1(int a){System.out.println("One int Args");
    }
    public void m1(String name){System.out.println("one string Args");
    }
    public static void main(String[] args) {
        Methodoverloading m = new Methodoverloading();
        m.m1();
        m.m1(10);
        m.m1("ritom");
    } 
}
