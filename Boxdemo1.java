class box{
    double width;
    double height;
    double depth;
    double voulme(){
        return width*height*depth;
    }

    Box(double w, double h,double d){
        width=w; 
        height=h;
        depth=d;
    }

    Box(){
        width=-1;
        height=-1;
        depth=-1;
    }

    Box(int len){
        width=height=depth=len;
    }
}

class Boxdemo1{
    public static void main(String[]args){
        Box mybox1=new Box(10,20,15);
        Box mybox2=new Box();
        Box mycube=new Box(7);

        vol=mybox1.volume();
        System.out.println("The volume of the first box is==> "+vol);

        vol=mybox2.volume();
        System.out.println("The volume of the second box is==> "+vol);

        vol=mycube.volume();
        System.out.println("The volume of the second box is==> "+vol);
    }
}


