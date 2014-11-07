
public class Student {

	private String name; 
	private char gender;
	private int age;
	private String module;
	
	public Student (String name, char gender, int age, String module ) {
		
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.module = module;
		
		
		
}
public void displayStudentDetails() {
	System.out.println("Name: " + name + "Gender" + gender + " Age " + age + "Module" + module);
	
}}
