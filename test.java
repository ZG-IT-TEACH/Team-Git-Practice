package cn.zhongyuangong;

public class test {
	void fun(Shape sp) {
		System.out.println(sp.getArea());
	}
	public static void main(String[] args) {
		test tt=new test();
		Circle cc=new Circle("blue",true);
		cc.setRadius(5);
		Square sq=new Square("red",true);
		sq.setSide(5);
		Rectangle re=new Rectangle("grey",true);
		re.setLength(5);
		re.setWidth(4);
		System.out.println(cc);
		tt.fun(cc);
		System.out.println(sq);
		tt.fun(sq);
		System.out.println(re);
		tt.fun(re);
	}
}
