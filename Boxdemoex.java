class Boxex{
	double width;
	double height;
	double depth;

	Boxex(double w,double h,double d){
	width=w;
	height=h;
	depth=d;
	}
	double volume(){
     return width*height*depth;
	}
	//method overloading
	Boxex(){
		width=-1;
		height=1;
		depth=-1;
	}
    Boxex(double len){
    	width=height=depth=len;
    }

	
}

class Boxdemoex{
	public static void main(String[]  args)
	{
	Boxex b1=new Boxex(2,2,3);
	Boxex b2=new Boxex();
	Boxex mycube=new Boxex(7.34);
	
	double vol;

	vol=b1.volume();
	System.out.println("the volume is "+vol);

	vol=b2.volume();
	System.out.println("the volume is "+vol);
    
    vol=mycube.volume();
    System.out.println("the volume is "+vol);

	}
}