class hello {
    String name;
    int roll;
    int system_id;

    public void student(String name, int roll, int system_id) {
        this.name = name;
        this.roll = roll;
        this.system_id = system_id;
    }

    class student extends hello {
        void show() {
            System.out.println(
                    "hello your name is " + name + " and your roll is " + roll + "your system id is " + system_id);
        }

    }

    public static void main(String[] args) {
      student s = new student();

      s.student("riotm" ,38927294,3274527);
      s.show();

    }
}