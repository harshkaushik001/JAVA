class App1{
    class App2{
        int i=111;
    }
}
public class mainCCC{
    public static void main (String args[]){
        App1 a1=new App1();
        App1.App2 a2=a1.new App2();
        System.out.println(a2.i);
    }
}