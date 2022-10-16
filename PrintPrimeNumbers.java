package Assignment1;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		
		int num;
		
		System.out.println("Prime Numbers between 1 and 1000 are:- ");
		for(num=1;num<=1000;num++)
		{
			int count = 0;
			
				for(int i = 1; i<=num; i++)
				{
					if(num%i == 0)
					count++;
				}
				if(count==2)
				{
					System.out.println(num);
				}
			
		}
		
				
	}

}
