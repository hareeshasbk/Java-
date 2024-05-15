// Program :3
// Write a Java programme to illustrate different types of constructor 
// default constructor, parameterized construct

class Bank{
    String customer_name;
    int acc_no;
    float balance;

// Default Constructor

Bank()
{
    customer_name="Rama";
    acc_no=1234;
    balance=10000f;
}

// Parameterized Constructor

Bank(String x,int y,float z){

    customer_name=x;
    acc_no=y;
    balance=z;
    
}

void Display(){
    System.out.println("Account name:"+customer_name);
    System.out.println("Account no:"+acc_no);
    System.out.println("Balance:"+balance);

}
}
// Main class

class BankDemo{
    public static void main(String[] args) {
        System.out.println("Default Constructor:");
        Bank b=new Bank();
        b.Display();
        System.out.println();


        System.out.println("Parameterized Constructor:");
        Bank b1=new Bank("Ramesh",10023,4000.0f);
        b1.Display();

    }
}














