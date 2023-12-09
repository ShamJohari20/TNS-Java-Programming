package Day14;

public class Main {
	public static void main(String[] args) {

	area[] triangles = new area[3];

	triangles[0] = new area(5, 8);
	triangles[1] = new area(3, 6);
	triangles[2] = new area(7, 10);

	for (int i = 0; i < triangles.length; i++) {
		double area = triangles[i].calculateArea();
		System.out.println("Area of Triangle " + (i + 1) + ": " + area);
	     }
	  }
	}
	    


