import java.util.*;
class Box{
    float width;
    float height;
    float depth;
    public Box(){
        this.depth=1;
        this.width=1;
        this.height=1;
    }

    public Box(float width, float height, float depth){
        this.depth=depth;
        this.width=width;
        this.height=height;
    }

    public float getWidth(){
        return width;
    }

    public void setWidth(float width){
        this.width=width;
    }

    public float getHeight(){
        return height;
    }

    public void setHeight(float height){
        this.height=height;
    }

    public float getDepth(){
        return depth;
    }

    public void setDepth(float depth){
        this.depth=depth;
    }

    public float volume(){
        return height*depth*width;
    }
}
class BoxWeight extends Box{
float weight;
public BoxWeight(float width, float height, float depth, float weight){
super(width, height, depth);
this.weight=weight;
}
public BoxWeight(float weight){
this.weight=weight;
}
public float getWeight(){
return weight;
}
public void setWeight(int weight){
this.weight=weight;
}
}
public class BoxWeightDemo{
public static void main(String args[]){
Box b=new Box(5,6,4);
System.out.println("Width : "+b.getWidth()+" Height : "+b.getHeight()+" Depth : "+b.getDepth());
BoxWeight w = new BoxWeight(4,6,2,8);
System.out.println("Width : "+w.getWidth()+" Height : "+w.getHeight()+" Depth : "+w.getDepth()+"Weight : "+w.getWeight());
System.out.println("THE VOLUME IS  "+w.volume());
}
}