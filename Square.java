package cn.zhongyuangong;

public class Square extends Rectangle{
	protected double side;
	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Square(double side) {
		this.side=side;
		// TODO Auto-generated constructor stub
	}

	public Square(String color, boolean filed) {
		super(color, filed);
		// TODO Auto-generated constructor stub
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return this.side*this.side;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 4*this.side;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "color "+this.color+"\nfiled "+this.filed+"\nside "+this.side;
	}
		
}
