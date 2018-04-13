package cn.zhongyuangong;

public class Rectangle extends Shape{
	protected double width;
	protected double length;
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(String color, boolean filed) {
		super(color, filed);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return this.length*this.width;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(this.length+this.width);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nlength "+this.length+"\nwidth "+this.width;
	}
	
}
