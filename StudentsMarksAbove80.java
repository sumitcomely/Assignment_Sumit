package Assignment1;

public class StudentsMarksAbove80 {
	
	public static void main(String[] args)
	{
		int studentsMarks[] = {78,12,89,55,35};
		
		for(int i=0; i<studentsMarks.length; i++)
		{
			if(studentsMarks[i]>80)
			{
				System.out.println(studentsMarks[i]);
			}
		}
	}

}
