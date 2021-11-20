class FibbonacciDoWhile{
public static void main(String [] args){
  FibbonacciDoWhile fibbonacci1=new FibbonacciDoWhile();
  fibbonacci1.printUsingDoWhileLoop();
}

void printUsingDoWhileLoop(){
   int sum;
	int num1=0 ,num2=1;
	
	do
	{
	 System.out.print(num1 +" ");
    num1++;
	sum=num1+num2;
	num1=num2;
	num2=sum;
	
	}
	while(num1<=num2 && num1<=100);
	}
	
	}