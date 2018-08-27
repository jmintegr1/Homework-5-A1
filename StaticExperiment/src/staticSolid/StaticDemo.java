package staticSolid;

public class StaticDemo {

	public static void main(String[] args) { //This is why in Main method we don't need an object to call it

		Student Asif = new Student();
		Asif.Sid = 35;
		Asif.age = 41;
		Student.teacher = "Kudoz";   //Static belongs to class, we do not need an object to 
		                             //access "Static Variable"
	
		
		
				
		Student Steve = new Student();
		Steve.Sid = 51;
		Steve.age = 24;
		Student.teacher = "Kudoz";//Due teacher is a static variable we can use class name since static belongs to class
		                          //we don't need to use object name
		Asif.express();
		Steve.express();
		
		
		
		
		
		
	}

}
