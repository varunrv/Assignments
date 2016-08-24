import java.util.*;

abstract public class Adder {
	Scanner scan;
	public int num1,num2;


	public Adder(int base) {										//	Constructor reading values 
		try{
			scan = new Scanner(System.in);
			
			System.out.println("\nEnter the 1st octal number:");		//Read first input
			num1 = Integer.parseInt(scan.nextLine(), base);
			
			System.out.println("\nEnter the 2nd octal number:");		//Read second input
			num2 = Integer.parseInt(scan.nextLine(), base);
			scan.close();
			add(num1,num2);
			subtract();
			}
		catch(NumberFormatException e){
			System.out.println("Invalid Input type");
		}
		
	}
								
	abstract void add(int a,int b);		// Method to add the inputs
	
	
	abstract void subtract();	// Method to subtract the inputs
	
	
	public static void main(String args[]){
		System.out.println(" Enter type of number : 1- Binary, 2- Octal, 3-Hexa");
		
		Scanner scan= new Scanner(System.in);
		int input= scan.nextInt();				// Read input type
		
		switch(input){
		
			case 1: new BinaryAdders(2); //Create binaryOperation object
					break;
				
			case 2: new OctaAdder(8);		//Create octalOperation object
					break;
				
			case 3: new HexaAdder(16);		//Create HeaxdecimalOperation object
					break;
				
		}
		scan.close();
	}
}

	      
	
	      

	      
	
	      	
	   
	
