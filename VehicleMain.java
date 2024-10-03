import java.lang.*;
import java.util.*;
class Vehicle{
    void display(){
        System.out.println("This is a vehicle");
    }
}
class Car extends Vehicle{
    @Override
    void display(){
        System.out.println("This is a car");
    }
}
class Bike extends Vehicle{
    @Override
    void display(){
        System.out.println("This is a bike");
    }
}
public class VehicleMain{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of tyres : ");
        int n=sc.nextInt();
        switch(n){
            case 2:
            Bike b=new Bike();
            b.display();
            break;
            case 4:
            Car c=new Car();
            c.display();
            break;
            default:
            Vehicle v =new Vehicle();
        }
    }
}