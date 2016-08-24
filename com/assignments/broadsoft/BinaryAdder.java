package com.assignments.broadsoft;
class BinaryAdders extends Adder{
	
	 public BinaryAdders(int i) {
		// TODO Auto-generated constructor stub
		 super(i);
	}
		
	 @Override public void add(int a,int b){
		 	int x=a+b;
			String binaryResult = Integer.toBinaryString(x);			//Print addition value
			System.out.println("Addition Value is : " +binaryResult );
		}
	 @Override void subtract() {
		if(num1 < num2){
			int temp = num1;
			num1 = num2;
			num2 = temp;
			int num = num1 - num2;
			String binaryResult=Integer.toBinaryString(num);
			System.out.println(" Subtraction Value is : -" + binaryResult);
			return ;
		}
		 
		int num = num1 - num2;
		String binaryResult=Integer.toBinaryString(num);
		System.out.println(" Subtraction Value is : " + binaryResult);		
	}
}


  