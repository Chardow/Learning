
public abstract class Shape {
	private String shapeColor;

	
	public void setColor(String shapeColor){
		this.shapeColor = shapeColor;
	}
	public String getColor(){
		return this.shapeColor;
	}

	public abstract double  getArea(double a, double b);
	
	public Shape( String color){
		setColor(color);
	}
	public String toString(){
		return "Shape color is "+ getColor();
	}
}









/*
private double[] sides;

public void setSides(double[] sides){
	this.sides = new double[sides.length];
	for(int i = 0; i<sides.length;i++){
		this.sides[i] = sides[i];
	}
}
public double[] getSides(){
	return this.sides;
}
public Shape( String color,double...sides){
setColor(color);
setSides(sides);
}
	public double getArea(double[] sides){
		double area = 0.0;
		for(int i = 0; i<sides.length;i++){
			if(sides[i]>0){
				area+=sides[i];
			}
		}
		return area;
	}
*/