package day1;

public class Mobile {

	private float height;
	private float width;
	private float memorySize;
	private float processorSpeed;
	
	public Mobile(float height, float width, float memorySize, float processorSpeed) {
		super();
		this.height = height;
		this.width = width;
		this.memorySize = memorySize;
		this.processorSpeed = processorSpeed;
	}
	
	@Override
	public String toString() {
		return "Mobile [height=" + height + ", width=" + width + ", memorySize=" + memorySize + ", processorSpeed="
				+ processorSpeed + "]";
	}	
}
