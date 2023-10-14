package Day3;

public class Rectangle {

	
	int length;
    int breadth;
    
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area() {
        return length * breadth;
    }
    
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		  Rectangle r1 = new Rectangle(4, 5);
	      Rectangle r2 = new Rectangle(5, 8);

	        int a1 = r1.area();
	        int a2 = r2.area();

	        // Printing the areas
	        System.out.println("Area of rectangle 1 is : " + a1);
	        System.out.println("Area of rectangle 2 is : " + a2);

		
	}

}
