
public class CollegeStudent extends Student {
	private String csMajor;
	private int csYear;
	
	public void setCsMajor(String csMajor){
		this.csMajor = csMajor;
	}
	public String getCsMajor(){
		return this.csMajor;
	}
	
	public void setCsYear(int csYear){
		this.csYear = csYear;
	}
	public int getCsYear(){
		return this.csYear;
	}
	
	public CollegeStudent(String myName, int myAge, String myGender, String myIdNum, double myGPA, int csYear, String csMajor){
		super(myName, myAge, myGender, myIdNum, myGPA);
		setCsYear(csYear);
		setCsMajor(csMajor);
		
	}
	
	public String toString(){
		return super.toString() + ". For year: "+getCsYear()+". Major: "+getCsMajor()+".";
	}
}
