package Assignments.Week1_Day2;

public class FindIntersection {

	public static void main(String[] args) {
		
		int[] data1 = {1,2,3,4,5};
		int[] data2= {5,3,4,7,8};
		
		for(int i=0; i<data1.length; i++) {
			for(int j=0; j<data2.length; j++) {
				if(data1[i]==data2[j]) {
					System.out.println(data1[i]);
					break;
				}
			}

	}

}
}