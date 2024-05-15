// Program :10
// Java program to check whether a no. is prime or not 

class for_loop{
    public static void main(String[] args) {

    int N=4;
    int flag=0; 

for(int i=2;i<=N/2;++i) {
    if (N%i==0){

        flag=1;
        break;
    }
}
    
if (flag==1)
System.out.println(N+"is composite number");
else
System.out.println(N+"is prime number");

       } 
    }