public class constructor {
    String name;
    int roll;
    String address;
    
    // default constructor
    constructor(){
        System.out.println("hello this is default constructor");
    }
    // constractor with parameter..We use this to refer to the current object and distinguish the object's variables from constructor parameters with the same name.

    // its mean this use for refers current object and use when the parameter name same with main class and constructor

    constructor(String name , int roll , String adress){
        this.name = name;
        this.roll = roll;
        this.address = adress;
    }

    void display(){
        System.out.println("student name is" + name);
        System.out.println("student roll is" + roll);
        System.out.println("student adress is" + address);
        System.out.println("\n");
    }

    public static void main(String[] args) {
        constructor s = new constructor("ritom",333,"bangladesh");
        constructor s1 = new constructor("priya",333,"bangladesh");
        s.display();
        s1.display();
    }
    
}