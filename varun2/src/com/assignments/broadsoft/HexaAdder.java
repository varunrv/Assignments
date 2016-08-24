package com.assignments.broadsoft;
class HexaAdder extends Adder{
	
	public HexaAdder(int i) {
		// TODO Auto-generated constructor stub
		super(i);
	}	
	
	@Override void add(int a,int b){
		String hexaResult=Integer.toHexString((a+b));					//Print addition value
		System.out.println("Addition Value is : " +hexaResult );
	
	}
	
	@Override void subtract() {
		if(num1 < num2){
			int temp = num1;
			num1 = num2;
			num2 = temp;
			int num = num1 - num2;
			String hexaResult=Integer.toHexString(num);
			System.out.println(" Subtraction Value is : -" + hexaResult);
			return ;
		}	
		
		int num = num1 - num2;
		String hexaResult=Integer.toHexString(num);
		System.out.println(" Subtraction Value is : " + hexaResult);		
	}
}

