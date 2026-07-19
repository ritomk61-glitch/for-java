public class Calculate {
    public void addition(int a , int b){
       int sum = a + b;
       System.out.println("sum =" + sum);

    }

    
    public void dic(int a , int b){
   int dicc = a - b;
   System.out.println("dic =" + dicc);

}
    public void mul(int a , int b){
   int mul = a * b;
   System.out.println("multi =" + mul);
}
    public void div(int a , int b){
   int div = a / b;
   System.out.println("div =" + div);
}
    public static void main(String[] args){
        Calculate a = new Calculate();
        a.addition(10, 20);
        a.dic(20, 10);
        a.mul(3, 3);
        a.div(30, 3);
    }
}
