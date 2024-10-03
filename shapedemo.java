class Shape
{ public void display()
  { System.out.println("This is a shape");
  }
}

class Circle extends Shape
{ public void display()
  { System.out.println("This is a circular shape");
  }
}

class Rectangle extends Shape{
public void display(){
System.out.println("rectangular shape");
}
}

class Square extends Rectangle
{ public void display()
  { System.out.println("Square is a rectangle");
  }
}

class ShapeDemo
{ public static void main(String[] args)
  { Shape S1 = new Shape();
    { S1.display();
    }
    Circle C1 = new Circle();
    { C1.display();
    }
    Rectangle R1 = new Rectangle();
    { R1.display();
    }
    Square Sq = new Square();
    { Sq.display();
    }
  }
}
