package Assignments.Week1_Day2;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
							int[] arrNum= {12,56,324,56,13,578};
//				Step1: Sort array
//				step2: print the last element of the array

				Arrays.sort(arrNum);
				//System.out.println("Largest element in array: " +arrNum[arrNum.length-1]);
				System.out.println("Second Largest element in array: " +arrNum[arrNum.length-2]);
				//second smallest number in an array
				//int arrayvalue = Collections.reverseOrder();
			}

		}

	