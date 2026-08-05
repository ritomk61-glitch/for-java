class a {
    public void  r1(){System.out.println("hwllo dfkjasd");}
}


class e extends a{
    public void r2(){System.out.println("hwllo this is e");}
}

class main{
    public static void main(String[] args) {
    e c = new e();
    c.r1();
    c.r2();

    }
}