// Program :15
// Java program to implement single inheritence

// Supre class 

class Employee{
    int salary=25000;
}

// Subclass 

class Programmer_Single_inherit extends Employee{
    int bonus=2000;
    public static void main(String[] args) {
        Programmer_Single_inherit p=new Programmer_Single_inherit();
        System.out.println("Programmer Salary is "+p.salary);
        System.out.println("Bonus of Programmer is "+p.bonus);
        
    }
}



