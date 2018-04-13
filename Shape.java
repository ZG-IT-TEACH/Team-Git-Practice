package cn.zhongyuangong;

public abstract class Shape {
		protected String color;
		protected boolean filed;
		public Shape() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Shape(String color, boolean filed) {
			super();
			this.color = color;
			this.filed = filed;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public boolean isFiled() {
			return filed;
		}
		public void setFiled(boolean filed) {
			this.filed = filed;
		}
		abstract double getArea();
		abstract double getPerimeter();
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "color "+this.color+"\nfiled "+this.filed;
		}
		
		
}
