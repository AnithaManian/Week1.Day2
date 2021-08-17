package Assignments.Week1_Day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String input1="stops";
		String input2="anita";

boolean anagramw = true;
//		Scanner scan= new Scanner(System.in);
//		System.out.println(“Enter first word:”);
//		String input1 =scan.nextLine();
//		System.out.println(“Enter second word:”);
//		String input2= scan.nextLine();
		char[] A=input1.toCharArray();
		char[] B=input2.toCharArray();
		for(int i=0;i<A.length;i++)
		{
		for(int j=0;j<B.length;j++)
		{
		Arrays.sort(A);
		Arrays.sort(B);
		if(A[i]==B[i])
		{
		anagramw = true;
		}
		else
		{
		anagramw =false;
		}
		}
		}
		System.out.println(anagramw + " and Both words are anagram words!!");
		}
		
	
}