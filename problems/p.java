class P {

    static int sum(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        return n + sum(n - 1);
    }

    public static void main(String[] args) {

        System.out.println("Hello, this is my first Java code");

        System.out.println(sum(5));
    }
}