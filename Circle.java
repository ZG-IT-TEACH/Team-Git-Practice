package cn.zhongyuangong;

public class Circle extends Shape{
	protected double radius;
	
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(String color, boolean filed) {
		super(color, filed);
		// TODO Auto-generated constructor stub
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	double getArea() {
		return this.radius*this.radius*3.14;
	}

	@Override
	double getPerimeter() {
		return 2.0*this.radius*3.14;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nradius "+this.radius;
	}
	
}
