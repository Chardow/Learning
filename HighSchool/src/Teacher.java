
public class Teacher extends Person {

	private String teacherSubject;
	private double teacherSalary;


	public void setTeacherSubject(String teacherSubject){
	this.teacherSubject = teacherSubject;
	}
	public String getTeacherSubject(){
		return this.teacherSubject;
	}
	
	public void setTeacherSalary(double teacherSalary){
		this.teacherSalary = teacherSalary;
	}
	public double getTeacherSalary(){
		return this.teacherSalary;
	}
	
	public Teacher(String myName, int myAge, String myGender, String teacherSubject, double teacherSalary){
		super(myName, myAge, myGender);
		setTeacherSubject(teacherSubject);
		setTeacherSalary(teacherSalary);
	}
	public String toString(){
		return super.toString() +". My subject: "+getTeacherSubject()+". My salary is "+getTeacherSalary();
	}
}
