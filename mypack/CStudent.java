package mypack;


class Students{
	public String Sid;
	public String Sname;
	public String Scourse;
	public static int COUNT=0;
	public static String prefix="cs";
	public Students( String sname, String scourse) {
		
		Sname = sname;
		Scourse = scourse;
		COUNT++;
		Sid=prefix+COUNT;
	}  
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", Scourse=" + Scourse + "]";
	}
	
}
public class CStudent{
	public static void main(String[] args) {
		
		Students s1 = new Students("sameer", "pyton");
		Students s2 = new Students("xyz", "Java");
		Students s3 = new Students("zahid", ".NET");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}
}
