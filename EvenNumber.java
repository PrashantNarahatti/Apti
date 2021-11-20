class EvenNumber{
public static void main(String [] args){	
EvenNumber evenNumber=new EvenNumber();
evenNumber.printUsingForLoop();
evenNumber.printUsingWhileLoop();
evenNumber.printUsingDoWhileLoop();

}
void printUsingForLoop(){
   int num=50;  
    
     for (int i=1; i<=num; i++)   
   {  

        if (i%2==0)   
   {  
   System.out.print(i + " ");  
   } 
   }
    System.out.println();   
      
 }
 
 void printUsingWhileLoop(){
	 int num=0;
        while(num<=50)
		{
		if(num%2==0)
		{
			
		System.out.print(num +" ");  
	   }
	   num++;
	   }
	   		System.out.println();
 }

void printUsingDoWhileLoop(){
	int i=0;
     do
        {
            if(i%2==0)
                System.out.print(i+" ");
            i++;
        }while(i<50);
    }
   }



