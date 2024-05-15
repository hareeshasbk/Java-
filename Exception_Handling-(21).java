// Program :21
// Java program to implement Exception Handling

class Exception{
    public static void main(String[] args) {
        int a=10,b=0,c;
        try{
            c=a/b;
            System.out.println("c="+c);
        }
        catch(ArithmeticException e){
            System.out.println("Zero Division Error");
        }
        System.out.println("End of program");
    }
}
