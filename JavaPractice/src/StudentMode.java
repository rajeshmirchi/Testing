
public class StudentMode {

	public static void main(String args[])
	{
		Student ss=new Student();
		ss.setStudentName("neeima");
		ss.setRollNo(1);
		ss.setMarks(100);
		
		StudentApiFc ab=new StudentApiFc();
		StudentConfirm sc = null;
		try {
			sc = ab.createSheet(ss);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sc.getRollNo());
	}
}
