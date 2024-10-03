 
public class ClassA{
    public void displayA(){
        System.out.println("Class A");
    }
}

import p1.ClassA;
Class PackageTest1{
public static void main(String args[]){
ClassA obA=new ClassA();
obA.displayA();
}
}