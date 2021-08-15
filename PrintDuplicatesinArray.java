package Assignments.Week1_Day2;

public class PrintDuplicatesinArray {

	public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 3,4,5, 6, 5, 4, 5 };
        int count;
        for (int i = 0; i < arr.length; i++)// i=0 ,0<6
        {
            count = 1;
            for (int j = i + 1; j < arr.length; j++)// i=0;j=1==>arr[0]=1 arr[
            {
                if (arr[i] == arr[j]) {
                    count++;
                    //System.out.println(arr[i]);
                    
                    arr[j] = 0;
                }
            }
            if(count>1 && arr[i] !=0) {
                System.out.println(arr[i]);
                
            }
        }
    }

	}

