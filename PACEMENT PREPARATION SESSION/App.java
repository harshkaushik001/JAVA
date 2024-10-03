public class App{
public String name;
public static void swap(App a1, App a2){
    App temp=a1;
    a1=a2;
    a2=temp;
    a1.name="third";
}
public static void main(String args[]) throws Exception{
    App a1=new App();
    a1.name="first";
    App a2 =new App();
    a2.name="second";
    swap(a1,a2);
    System.out.println(a1.name);
    System.out.println(a2.name);
}
}