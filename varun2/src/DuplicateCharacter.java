import java.util.*;
import java.io.*;
public class DuplicateCharacter {
	public static void main(String args[]){
		typeOfInput();
		}
	
	
	static void typeOfInput(){
		String sourceString = null;
		int input=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the mode of input: 1-Console, 2-File");
		input=scan.nextInt();
		switch(input){
		case 1: System.out.println("Enter the string");
				Scanner sc = new Scanner(System.in);

				sourceString = sc.nextLine();
				if(sourceString.length()==0){
					System.out.println("String Not entered");
					return;
				}
				break;
		case 2:   try {
					Scanner sca = new Scanner(System.in);
					System.out.println("Enter the path of the file");

					String filePath= sca.nextLine();
					Scanner reader = new Scanner(new FileInputStream(filePath));
					sourceString= reader.nextLine();

				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("File not found");
					e.printStackTrace();
				}
				catch(NoSuchElementException e)
				{
					e.printStackTrace();
					System.out.println("Empty File");
				}
				break;
		}
		
		sourceString=sourceString.toLowerCase();
		duplicateChar(sourceString);
	}
	
	static void duplicateChar(String sourceStr){
		int count=1;char ch;
		int numberOfDupCharacters=0;
		for(int i=0;i<sourceStr.length();i++){
			ch=sourceStr.charAt(i);
			if(ch==' ')break;
			for(int j=i+1;j<sourceStr.length();j++) {
				if(sourceStr.charAt(j)==sourceStr.charAt(i))
					count++;
			}
			if(count>1) {
				System.out.println("Character: "+sourceStr.charAt(i) +  " Count: "+count);
				numberOfDupCharacters++;
				count=1;
		}	
	}
		       System.out.println("Total number of duplicate chatracters:"+ numberOfDupCharacters);
	}
}
