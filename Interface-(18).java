// Program :18
// Java program to implement interface

// Create an interfeace class

interface C{
    void drawA();
    void drawB();
}

class D implements C{
    public void drawA(){
        System.out.println("Drawing Tool 1");
    }


public void drawB(){
    System.out.println("Drawing Tool 2");
}
}

class Interface_Test{
    public static void main(String[] args){
        C c =new D();
        c.drawA();
        c.drawB();
    }
}

