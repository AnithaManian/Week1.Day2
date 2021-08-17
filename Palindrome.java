package Assignments.Week1_Day2;

public class Palindrome {

	public static void main(String[] args) {
	
		String input="nmalayalam";
		String output="";
		
		char[] charArray=input.toCharArray();
		
		for(int i=charArray.length-1; i>=0; i--) {
					output = output+charArray[i];
		
		}
		System.out.println(output);
		
		if(input.equals(output))	{
		System.out.println("palindrome");
	}else {
		System.out.println("Not Palindrome");
		
	}
}
}