class FactorialNumber{
public static void main(String [] args){
 FactorialNumber factorialNumber=new FactorialNumber();
 factorialNumber.printUsingForLoop();
 factorialNumber.printUsingWhileLoop();
 factorialNumber.printUsingDoWhileLoop();
 factorialNumber.printUsingRecursion(1);
}
void printUsingForLoop(){
	
         
        int num = 3;
        long factorial = 1;

        for (int i = 1; i <= num; i++)
        {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
    }

	
void printUsingWhileLoop(){
      
 int num = 5, i = 1;
        long factorial = 1;
        while(i <= num)
        {
            factorial *= i;
            i++;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    
		System.out.println();

    }
	
void printUsingDoWhileLoop(){
    int num=5;
        long factorial = 1;
        int i = 1;
        
        do
        {
            factorial = factorial * i;
            i++;
        } while (i <= num);{

        System.out.println("Factorial of " + num + " is: " + factorial);
    }
	System.out.println();
}


public int printUsingRecursion(int n){   
    
  if (n == 0)    
    return 1;    
    else    
    return(n * printUsingRecursion(n-1));    
 }    

}
