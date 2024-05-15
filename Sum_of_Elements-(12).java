// Program :12
// Java program to find Sum of Elements in Arrays 
import java.util.Arrays;

class Array_for_loop{
    public static void main(String[] args) {

        int a[]={10,50,60,54,98,65};

        System.out.println(Arrays.toString(a));
        
        int i,sum=0;
        for (i=0;i<a.length;i++)
        sum=sum+a[i];

        // int sum=0;
        // for (int i=0;i<a.length;i++)
        // sum=sum+a[i];
        System.out.println("Sum="+sum);

    }
}



