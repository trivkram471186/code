package day1;

public class Rectangle extends Shape{

	float height;
	float width;
	
	
	public Rectangle(float height, float width) {
		super();
		this.height = height;
		this.width = width;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		System.out.println("Rectangle");
	}
}
