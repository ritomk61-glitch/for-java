// Encapsulation,abstaction,inheritance,Polymorphism

// object and class

/*
object is real world entities
1.characteristics of an objects
?class a blueprint of an object
!a class a collection of object
abstraction = hiding implementation details + showing only essential features
*/

public class OOPs {
    int sid;
    String sname;
    void det(int id , String name){
           sid = id;
           sname = name;
    }
    void display(){
        System.out.println("your name is"+ sname + "and your system id" + sid);
    }

    public static void main(String[] args) {
        OOPs s = new OOPs();
        s.det(2025834055,"ritom kumar");
        s.display();
    }
}
