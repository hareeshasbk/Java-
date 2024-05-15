// Program :2

// Write a Java programme to illustrate types of variables
//  local variables ,instance variables, static variable

class Variable{
    int rollno; //instance variables
    int m1;  //instance variables
    int m2;  //instance variables
    static String branch_name="Computer Science";  //String variable


void getData(int x,int y,int z){
    rollno=x;
    m1=y;
    m2=z;

}

void Display(){
    float avg=(m1+m2)/2 ; // avg is local variable
    System.out.println("Roll No:"+rollno);
    System.out.println("M1:"+m1);
    System.out.println("M2:"+m2);
    System.out.println("Average:"+avg);
    System.out.println("Branch:"+branch_name);
}

}

// Main class

class demo{
    public static void main(String[] args) {
        Variable v=new Variable();
        v.getData(33, 78, 97);
        v.Display();
    }
}





