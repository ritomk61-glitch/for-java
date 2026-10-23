// exception handeling
/* 
its manage runtime error.ensuring the program does not crash and can continue normal execution.  It relies on five primary keywords: try, catch, finally, throw, and throws.

exception is the child class of the throbal class
exception class present in java.language package
throbal class there have 2 types:
1.exception and error

error:error is a serious problem if occur the error the in your program so lost the lack of recourses
error can not handel try , catch and throw word

types of exception:
there have 2 types exception: compile time and run time;

we can say compile time checked exception  and run time is unchecked.

compile time:

those time verify by the time at the compile time.its called compaile time

run time:

those exception is not verfy by the  
jbm is responsible for verify the exception.

*/
public class Main {
    public static void main(String[] args) {

        int list[] = {10, 20, 30, 40, 50};

        System.out.println(list[2]);

        String msg = "Hello";
        System.out.println(msg.length());

        String name = "123";
        int i = Integer.parseInt(name);

        System.out.println(i);
    }
}