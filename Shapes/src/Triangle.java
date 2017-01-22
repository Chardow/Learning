
public class Triangle extends Shape {

	private double base;
	private double height;
	
	public void setBase(double base){
		this.base = base;
	}
	public double getBase(){
		return this.base;
	}
	
	public void setHeight(double height){
		this.height = height;
	}
	public double getHeight(){
		return this.height;
	}
	
	public Triangle (String color, double base, double height){
		super(color);
		setBase(base);
		setHeight(height);
	}
	
	@Override
	public double getArea(double a, double b){
		return a*b;
	}
	public String toString(){
		return super.toString()+". The area is "+getArea(getHeight(), getBase());
	}
}
