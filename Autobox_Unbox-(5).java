// Program :5
// Java program to illustrate Autoboxing and Unboxing

class Box{
    public static void main(String[] args) {
        // Autoboxing
        // Autoboxing of int
        System.out.println("Autoboxing of Integer:-");
        int a=5;
        Integer A=a;
        System.out.println(A);


        // Autoboxing of char
        System.out.println("Autoboxing of Charecters:-");
        char c='a';
        Character C=c;
        System.out.println(C);

        // Autoboxing of float
        System.out.println("Autoboxing of float:-");
        float f=10.5f;
        Float F=f;
        System.out.println(F);

        // Autoboxing of double
        System.out.println("Autoboxing of double");
        double d=18.58;
        Double D=d;
        System.out.println(D);

        // Unboxing
        // Unboxing of Integer
        System.out.println("\n\nUnboxing of integer");
        Integer I =66;
        int i=I;
        System.out.println(i);

        // Unboxing of Character
        System.out.println("Unboxing of char");
        Character C1='B';
        char c2=C1;
        System.out.println(c2);

        // Unboxing of Float
        System.out.println("Unboxing of Float");
        Float F3=10.5f;
        float f4=F3;
        System.out.println(f4);

        // Unboxing of Double
        System.out.println("Unboxing of Double");
        Double D1=10.7;
        double d2=D1;
        System.out.println(d2);

    }
}


