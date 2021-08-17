package Assignments.Week1_Day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String str="Anitha";
		char[] charArray=str.toCharArray();
		for (int i=0; i<charArray.length;i++) {
		if(i%2==0) {
				System.out.println(Character.toUpperCase(charArray[i]));
			}
			else {
				System.out.println(charArray[i]);
			}
		}
		

	}
}

