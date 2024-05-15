// Program :20
// Java program to implement ISP (Interface Segregation Principle)

interface ST{
    public void soft();
}

interface CT{
    public void elect();
}

interface MT{
    public void magnet();
}

interface HT{
    public void hard();

}

class IK implements ST,CT,MT,HT{
    public void soft(){
        System.out.println("These are Soft Toys:");
    }

    public void elect(){
        System.out.println("These are Electrical or Current Toys");
    }

    public void magnet(){
        System.out.println("These are Magnetic Toys");
    }
    
    public void hard(){
        System.out.println("These are Hard Toys:");
    }
}


class Interface_Segregation_Principle{
    public static void main(String[] args) {
        IK a=new IK();
        a.soft();
        a.elect();
        a.magnet();
        a.hard();
    }
}