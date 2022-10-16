package Assignment1;

public class AverageOfFiveGivenNumbers {
	
	public static void main(String[] args) {
		
		int a[] = {10,90,78,111,8989,7876};
		
		int sum = 0;
		
		for(int i=0; i<a.length; i++)
		{
			sum = sum+a[i];
		}
		
		double avg = sum/a.length;
		
		System.out.println("Average of given numbers are: "+avg);
	}

}
