// public class String2 {
//     public static void main(String[] args) {
//      String name = new String("Ritom");
//      String name1 = new String("Ritom");

//      String name2 =new String("priya");

//      System.out.println(name == name1 );
//      System.out.println(name1 == name2);
//      System.out.println(name1.hashCode());
//      System.out.println(name1.hashCode());
//      System.out.println(name2.hashCode());
//      System.out.println(name.hashCode() == name1.hashCode());
//      System.out.println(name.hashCode() == name2.hashCode());
//      System.out.println(name.equals(name1));
//      System.out.println(name1.equals(name2));
//     }
// }


/**
 * String2
 */
public class String2 {
  public static void main(String[] args) {
    
      String name = "Ritom";
      String rev = "";
      
      for( int i = name.length()-1 ; i>=0 ; i--) {
          System.out.println(rev = rev + name.charAt(i));
    }
}
}