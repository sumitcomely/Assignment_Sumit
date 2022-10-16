package Assignment1;

public class BreakCurrentExecutionIfFindNumber85 {

	public static void main(String[] args) {
		
		int num[] = {12,34,66,85,900};
		
		for(int i: num)
		{
			if(i==85)
				break;
				System.out.println(i);
		}

	}

}
