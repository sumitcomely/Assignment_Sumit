package Assignment1;

public class SumOfFiveNumbers {

	public static void main(String[] args) {
		
		int a[] = {10,90,78,111,8989,7876};
		int sum = 0;
		
		for(int i=0; i<a.length; i++)
		{
			sum = sum+a[i];
		}
		
		System.out.println("Sum of given numbers are: " +sum);

	}

}
