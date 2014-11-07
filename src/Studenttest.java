
public class Studenttest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("john",'m',20, "computer science");
		s1.displayStudentDetails();
		
		Student s2 = new Student("anna",'F', 18, "dance");
		s2.displayStudentDetails();
		s2.changeName("Bob");
		s2.displayStudentDetails();
	}

}
