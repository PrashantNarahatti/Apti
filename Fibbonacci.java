class Fibbonacci{
 public static void main(String [] args){
  Fibbonacci fibbonacci=new Fibbonacci();
  fibbonacci.printUsingForLoop();
  fibbonacci.printUsingWhileLoop();
  fibbonacci.printUsingRecursion(0,1);
 }
 void printUsingForLoop(){
   int sum;
	int num1=0 ,num2=1;
	
	for(int i=1;i<=10;i++){
		System.out.print(num1 +" ");
	num1++;
	sum=num1+num2;
	num1=num2;
	num2=sum;
	}
 System.out.println();
 }	
		
 void printUsingWhileLoop(){
   int sum;
	int num1=0 ,num2=1;
	
	while(num1<=num2 && num1<=100){
	System.out.print(num1 +" ");
	num1++;
	sum=num1+num2;
	num1=num2;
	num2=sum;
	}
 System.out.println();
 }
 
 void printUsingRecursion(int num1 ,int num2){
	 if(num1<=100){
	 System.out.print(num1 + " ");
	 int sum;
	 sum=num1 + num2;
	 printUsingRecursion(num2 ,sum);
 }
 }
}
