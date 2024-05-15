// Program :13
// Java program to print 2D-Array

import java.util.Arrays;

class Transpose_for_loop{
    public static void main(String[] args) {
        int a[][]={{1,2},{3,4}};

        System.out.println("Original Matrix:");

        for (int i=0;i<a.length;i++){

            for (int j=0;j<a.length;j++){

                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println("Transpose of given matrix:");
            for (int i=0;i<a.length;i++){

                for (int j=0;j<a.length;j++){
                    
                    System.out.print(a[j][i]+" ");
                }
            System.out.println();   
        }
    }
}



