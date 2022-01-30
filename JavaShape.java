import java.util.Scanner;

public class JavaShape {
    public static void main(String args[]) throws Exception{
        Scanner src = new Scanner(System.in);
        int l = src.nextInt();
        int b = src.nextInt();

        src.close();

        Shape shape = new Shape(l,b);
        shape.area();

        Shape rectangle = new Rectangle(l,b);
        rectangle.area();
    }
}

class Shape{
    public int length;
    public int breadth;
    public Shape(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    
    public void area(){
        
    }
}

class Rectangle extends Shape{

    public Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    public void area() {
        super.area();
        System.out.println(length +" "+ breadth);
        System.out.println(length * breadth);
    }

}
