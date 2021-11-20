class PrimeNumber{
public static void main(String [] args){
 PrimeNumber primeNumber=new PrimeNumber();
 primeNumber.printUsingForLoop();
 primeNumber.printUsingWhileLoop();
 primeNumber.printUsingDoWhileLoop();
 primeNumber.printUsingRecursion(0,1);
 
}
void printUsingForLoop(){
      int i =0;
       int num =0;
      
       String  primeNumbers = "";

       for (i = 1; i <= 100; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println(primeNumbers);
   
}
void printUsingWhileLoop(){
 int num;
  int num1= 1;
  int count;

  while (num1<= 100) {
   count = 0;
   num = 2;
   while (num <= num1 / 2) {
    if (num1% num== 0) {
     count++;
  
    }
    num++;
   }
   if (count == 0 && num1 != 1) {
    System.out.print(num1 + " ");
   }
   num1++;
  }
System.out.println();
 }
 
 void printUsingDoWhileLoop(){
	  int num;
	  int n=1;
	  int count;
		  do
		  {
			count=0;
		    num=2;
		  do
		  {
		   if(n% num ==0){
					  
			count++;
				  }
		    num++;
	  
	      }
	    while(num<=n/2);
        if (count == 0 && n != 1) {
           System.out.print(n + " ");
         }
         n++;
		 
      }while(n<=100);
	  System.out.println();
	 }
	 
 public int printUsingRecursion(int i ,int num){
	 
	  if(num==0)
        return 1;
    if(i%num==1)
		return 0;
        else{
	   
   }
      return printUsingRecursion(i, num-1);
}
	 
}


