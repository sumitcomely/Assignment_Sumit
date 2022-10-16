package Assignment1;

public class BreakCurrentExecutionIfFindStringSelenium {

	public static void main(String[] args) {
		
		String str[] = {"Java","JavaScript","Selenium","Python","Mukesh"};
		
		for(String s: str)
		{
			if(s=="Selenium")
				break;
				System.out.println(s);
		}

	}

}
