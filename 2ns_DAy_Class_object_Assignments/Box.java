package Assignment_2nd_Days;

import java.util.Scanner;

public class Box {
	private int width;
	private int height;
	private int depth;

	public Box(int width, int height, int depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public double volume_of_Box() {

		return width * height * depth;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		Box b1 = new Box(sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.println("Volume of box = " + b1.volume_of_Box());

	}
}
