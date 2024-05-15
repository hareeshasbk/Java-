// Program :17
// Java program to illustrate polymorphism (Method Overriding)

// Super class 
class Shape{
    void draw(){
        System.out.println("Drawing");
    }
}


// Sub class 
class Rect extends Shape{
    void draw(){
        System.out.println("Drawing Rectangle:");
    }
}

// Sub class
class Tri extends Shape{
    void draw(){
        System.out.println("Drawing Triangle:");
    }
}

class Poly_Meth_Overriding{
    public static void main(String[] args) {
        Shape s;
        s=new Rect();
        s.draw();
        s=new Tri();
        s.draw();
    }
}

