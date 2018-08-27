package staticSolid;

public class Student {
	int Sid;
	int age;
	static String teacher;   //Since teacher is the same for both students we can make it a static variable

	public void express() {
		
		System.out.println(Sid + " : " + age + " : " + teacher);
	}
	
}
