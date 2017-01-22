
public class Rectangle extends Shape{

	private double leight;
	private double widht;

	public void setLeight(double leight){
		this.leight = leight;
	}
	public double getLeight(){
		return this.leight;
	}
	
	public void setWidht(double widht){
		this.widht = widht;
	}
	public double getWidth(){
		return this.widht;
	}
	
	
	public Rectangle(String color, int width, int leight){
		super(color);
		setWidht(width);
		setLeight(leight);
	}
	@Override
	public double getArea(double a, double b) {
		return a*b;
	}
	public String toString(){
		return super.toString()+". The area is "+getArea(getLeight(), getWidth());

	}
}

