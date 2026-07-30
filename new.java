
    class AA
{ 
	public void m1(){System.out.println("M1()");}
    public void m2(){System.out.println("M2()");}
    public void m4(){System.out.println("M4()");}
}
class B extends AA
{
	public void m3(){System.out.println("M1()");}
}
class C extends B 
{
	public void m5(){System.out.println("M5()");}
}
class Main {
	public static void main(String[] args) 
	{
		C c=new C();
		c.m1();
		c.m2();
		c.m5();
	}
}

