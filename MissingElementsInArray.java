package Assignments.Week1_Day2;

import java.util.Arrays;

public class MissingElementsInArray {

	public static void main(String[] args) {
        int[] number = {8, 6, 3, 2, 4, 1};
        Arrays.sort(number);
        System.out.println("Missing Number is:" + getMissingNumber(number));
    }

    private static Integer getMissingNumber(int[] number) {
        Integer missed = null;
        for (int i = 0; i < number.length; i++) {
            int index = i + 1;
            if (number[i] != index) {
                missed = index;
                break;
            }
        }
        return missed;
    }
	
	}
