// public  class meii{
//     String name;
//     String address;

//     void show(String name, String address) {
//         this.name = name;
//         this.address = address;
//         this.display();
//     }

//     public void display() {
//         System.out.println("name=" + name);
//         System.out.println("address=" + address);
//     }

//     public static void main(String[] args) {
//         meii s = new meii();
//         s.show("pr","pp");
//     }
// }

// public  class meii{
//     String name;
//     String address;

//     void show(String name, String address) {
//         this.name = name;
//         this.address = address;
        
//     }

//     public void display() {
//         this.show("ritom","sony");
//         System.out.println("name=" + name);
//         System.out.println("address=" + address);
//     }

//     public static void main(String[] args) {
//         meii s = new meii();
//         s.display();
//     }
// }

// ? program- 3

class  meii{
    int x = 30;
    meii() {
        System.out.println("Parent Constructor");
    }
    public void show() {
        System.out.println("Parent show()");
    }
}

class Main extends meii {
    int x = 40;
    Main() {
        super();
        super.show();
        System.out.println("Child Constructor");
    }
    public void display() {
        System.out.println(this.x); // Refers to Child's x (40)
        System.out.println(super.x); // Refers to Parent's x (30)
    }

    public static void main(String[] args) {
        Main c = new Main();
        c.display();
    }
}