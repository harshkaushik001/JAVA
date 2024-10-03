interface Greater{
    public boolean isGreater(Object o);
}

class Employee implements Greater{
    int salary;

    Employee(){}

    Employee(int e){
        this.salary=e;
    }


public boolean isGreater(Object o){
    Employee e=(Employee)o;
    if(this.salary>e.salary){
        return true;
    }
    else{
        return false;
    }
}
}

public class mainCC{
    public static void main(String args[]){
        Greater e=new Employee(10);
        Greater e2=new Employee(100);
        System.out.println(e.isGreater(e2));
    }
}