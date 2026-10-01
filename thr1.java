class Student22 {
    String name;
    String address;

    Student22(String name, String address) {
        name = name;
        address = address;
    }

    public void display() {
        System.out.println("name=" + name);
        System.out.println("address=" + address);
    }

    public static void main(String[] args) {
        Student22 s = new Student22("SONIYA", "1001");
        s.display();
    }
}