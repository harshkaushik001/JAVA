// IMPLEMENTING MULTIPLE INHERITANCE
class Student{
    int rollnumber;
    void getnumber(int n){
        rollnumber=n;
    }

    void putnumber(){
        System.out.println("Roll Number => "+rollnumber);
    }
}

//
    class Test extends Student{
        float part1, part2;
        void getmarks(float m1,float m2){
                part1 =m1;
                part2 =m2;}
        void putMarks(){
            System.out.println("Marks Obtained");
            System.out.println("Part 1 ==> "+part1);
            System.out.println("Part 2 ==> "+part2);
        }    
    }
//
    interface Sports{
        float SportWt=6.0F;
        void putWt();
    }
//
    class Results extends Test implements Sports{
        float total;
        public void putWt(){
            System.out.println("Sports Wt ==>"+SportWt);
        }

        void display(){
            total =part1+part2+SportWt;
            putnumber();
            putMarks();
            putWt();
            
            System.out.println("Total Score ==> "+total);
        }
}
//

class Hybrid{
    public static void main(String args[]){
        Results Student1=new Results();
        Student1.getnumber(1234);
        Student1.getmarks(27.5F,33.0F);
        Student1.display();
    }
}

//