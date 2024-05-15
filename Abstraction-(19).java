// Program :19
// Java program to implement Abstraction

// Super class 

abstract class Sem4{
    abstract void display();
}

// Sub class 1
class Java extends Sem4{
    void display(){
        System.out.println("Java is one of the subject in 4th Sem ");
    }
}

// Sub class 2
class DSP extends Sem4{
    void display(){
        System.out.println("DSP is one of the subject in 4th Sem");
    }
}


// Sub class 3
class SE extends Sem4{
    void display(){
        System.out.println("SE is one of the subject in 4th Sem");
    }
}

// Sub class 4
class OS extends Sem4{
    void display(){
        System.out.println("OS is one of the subject in 4th Sem");
    }
}


class Abstraction{
    public static void main(String[] args) {
        Sem4 d;
        d=new Java();
        d.display();

        d=new DSP();
        d.display();

        d=new SE();
        d.display();
        
        d=new OS();
        d.display();
        
    }
}