class ThreadExpl extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread" + i);
        }
    }
}

class Main {
    public static void main(String[] args) {
        ThreadExpl t2 = new ThreadExpl();
        t2.start();
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread" + i);
        }
    }
}