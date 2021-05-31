package assignment_1;

class coordinate
{
	int x , y ;
	coordinate(int x, int y)
	{
		this.x = x;
		this.y = y;
     }
}


class Quadrilateral
{
	coordinate A = new coordinate(1,4);
	coordinate B = new coordinate(4,4);
	coordinate C = new coordinate(1,2);
	coordinate D = new coordinate(4,2);
	
}

class Trapezoid extends Quadrilateral
{
	int area()
	{
		int height = B.y - D.y;
		int a = B.x - A.x;
		int b = D.x - C.x;
		
		return (a+b) * height / 2;
	}
}

class Parallelogram extends Quadrilateral
{
	int area()
	{
	int base = B.x - A.x;
	int height = B.y - D.y;
	
	return base * height;
	}
}

class Rectangle extends Quadrilateral
{
	int area()
	{
		int length = B.x - A.x;
		int breadth = A.y - C.y;
		
		return length * breadth;
	}
}

class Square extends Quadrilateral
{
	int area()
	{
		int side = B.x - A.x;
		return (int)Math.pow(side, 2);
	}
}

public class Figures {

	public static void main(String[] args) {


		Trapezoid trap = new Trapezoid();
		Parallelogram para = new Parallelogram();
		Rectangle rec = new Rectangle();
		Square sq = new Square();
		
		System.out.println("Area Trapezoid: " +trap.area());
		System.out.println("Area Parallelogram: " +para.area());
		System.out.println("Area Rectangle: " +rec.area());
		System.out.println("Area Square: " +sq.area());

	}

}
