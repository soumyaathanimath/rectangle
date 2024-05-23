package rectangle;

public class Rectangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle();
		r.length=10.5;
		r.breadth=5.5;
		
		System.out.println("Area "+r.area());
		System.out.println("Perimeter "+r.perimeter());
		System.out.println("Is it Square "+r.isSquare());

	}

}
