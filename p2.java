public class p2 {
    public static void main(String[] args) {
     String name = "Ritom";
     String name1 = "Ritom";

     String name2 ="prianka";

     System.out.println(name == name1 );
     System.out.println(name1 == name2);
     System.out.println(name1.hashCode());
     System.out.println(name1.hashCode());
     System.out.println(name2.hashCode());
     System.out.println(name.hashCode() == name1.hashCode());
     System.out.println(name.hashCode() == name2.hashCode());
     System.out.println(name.equals(name1));
     System.out.println(name1.equals(name2));
    }
}
