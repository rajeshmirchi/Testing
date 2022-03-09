
public class StudentApiFc {

	public StudentConfirm createSheet(Student s) throws Exception
	{
		StudentConfirm sc=null;
		try {
			vaidateStudent(s);
			sc=insertSheet(s);
		}
		catch(Exception e1)
		{
			System.out.println(e1.getMessage());
		}	
		
	 return sc;
	}
	
	private StudentConfirm insertSheet(Student s) 
	{
		StudentConfirm sc= new StudentConfirm();
		sc.setRollNo(sc.getRollNo());
		System.out.println();
		return sc;
	}
	
	private void vaidateStudent(Student s)throws Exception
	{
		if(s.getStudentName()==null)
		{
			throw new Exception("mandaory");
		}
		if(s.getRollNo()==0)
		{
			throw new Exception("invalid");
		}
		if(s.getMarks()==0)
		{
			throw new Exception("invalid");
		}
	}
	
}


