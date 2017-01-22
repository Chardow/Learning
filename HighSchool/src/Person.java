
public class Person {
	protected String myName ;   // name of the person
	protected int myAge;    	// person’s age
	protected String myGender;  // “M” for male, “F” for female
	
	public void setMyName(String myName){
		this.myName=myName;
	}
	public String getMyName(){
		return this.myName;
	}
	
	public void setMyAge(int myAge){
		this.myAge=myAge;
	}
	public int getMyAge(){
		return this.myAge;
	}
	
	public void setMyGender(String myGender){
		this.myGender = myGender;
	}
	public String getMyGender(){
		return this.myGender;
	}
	
	public Person(String name, int age, String gender)  {
	setMyName(name); 
	setMyAge(age);
	setMyGender(gender);   
	}
	
	public String toString(){
	return myName + ", age: " + myAge + ", gender: " +myGender;
	}

}
