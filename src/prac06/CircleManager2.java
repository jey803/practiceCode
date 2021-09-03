package prac06;

import java.util.Scanner;

class Circle{
	private double x, y;
	private int radius;
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
	public int getRadius() {
		return radius;
	}
	
}
public class CircleManager2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Circle [] c = new Circle[3];
		for(int i=0; i<c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle(x, y, radius);
		}
		int max=0;
		for(int i=0; i<c.length; i++) {
			if(c[i].getRadius()>max)
				max = c[i].getRadius();
		}
		for(int i=0; i<c.length; i++) {
			if(max == c[i].getRadius()) {
				System.out.print("가장 면적이 큰 원은 ");
				c[i].show();
			}
		}
		
		scanner.close();
		
	}

}
