
public class Student extends Person {

	protected String myIdNum;	// Student Id Number
	protected double myGPA;  	// grade point average

	public void setMyIdNum(String myIdNum){
		this.myIdNum = myIdNum;
	}
	public String getMyIdNum(){
		return this.myIdNum;
	}
	
	public void setMyGPA(double myGPA){
		this.myGPA = myGPA;
	}
	public double getMyGPA(){
		return this.myGPA;
	}
	
	public Student(String name, int age, String gender, String idNum, double gpa)  {
	// use the super class’ constructor
	super(name, age, gender);
	// initialize what’s new to Student
	setMyIdNum(idNum);
	setMyGPA(gpa);
	} 	
	public String toString(){
		return super.toString() + ". Idnum: "+getMyIdNum()+". GPA: "+getMyGPA();
	}

}
