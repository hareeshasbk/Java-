// Program :4
// Java programme to illustrate garbage collector with 
// finalised method

class Destructor{
    protected void finialize(){
        System.out.println("Object is destroyed by the Garbage Collector");
    }


    public static void main(String[] args) {
        Destructor de=new Destructor();
        de.finialize();
        de=null;
        System.gc();
        System.out.println("Inside the main() method");

    }
} 





