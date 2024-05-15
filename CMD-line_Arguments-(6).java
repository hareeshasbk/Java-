// Program :6
// Java program to evaluate expression using command line arguments

class cmdln_argument{
    public static void main(String[] args) {
        float SI;
        float p=Float.parseFloat(args[0]);
        int t =Integer.parseInt(args[1]);
        float r=Float.parseFloat(args[2]);
        SI=(p*t*r)/100;
        System.out.println("Simple Interest="+SI);

    }
}






