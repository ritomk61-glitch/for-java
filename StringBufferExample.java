public class StringBufferExample {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Ritom");

        System.out.println(sb);

        System.out.println("stringbuffer:");

        sb.append(" Kumar");
        // System.out.println(sb);

           StringBuilder sb1 = new StringBuilder("Ritom");

        System.out.println(sb1);

        System.out.println("stringbuilder:");

        sb1.append(" Kumar");
        System.out.println(sb1);

        
    }
}
