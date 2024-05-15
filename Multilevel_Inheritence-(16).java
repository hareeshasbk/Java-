// Program :16
// Java program to implement multilevel inheritence

// Supre class

class A{
    void methA()
    {
        System.out.println("A class method");
    }
}

// Sub class 

class B extends A{
    void methB(){
        System.out.println("B class method");
    }
}

// Sub class

class C extends B{
    void methC(){
        System.out.println("C class method");
    }
}

class Multilevel_Inheritence{
    public static void main(String[] args) {
        {
            C c=new C();
            c.methA();
            c.methB();
            c.methC();
        }
    }
}

