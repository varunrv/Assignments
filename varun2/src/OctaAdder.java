public class OctaAdder extends Adder {
		
	OctaAdder(int a){
			super(a);
		}
	
	@Override	public void add(int a,int b){
			int x=a+b;
			String octaResult=Integer.toOctalString(x);			//Print addition value
			System.out.println("Addition Value is : " +octaResult );
		}
		
	@Override public void subtract(){
			if(num1<num2){
				int temp = num1;
				num1 = num2;
				num2 = temp;
				int num = num1 - num2;
				String octaResult=Integer.toBinaryString(num);
				System.out.println(" Subtraction Value is : -" + octaResult);
				return ;
			}			
			int num = num1 - num2;
			String octaResult=Integer.toOctalString(num);
			System.out.println(" Subtraction Value is : " + octaResult);		
		}
	}



