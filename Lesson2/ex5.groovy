//Exercise 5

double area
double perimeter

class Point { 
	double x;
	double y;
}

class Rectangle { 
	Point upLeft;
	Point downRight;
} 

Rectangle rect = new Rectangle();
Point upLeft = new Point();
Point downRight = new Point();

println ("Point 1 x coord: ")
upLeft.x = Double.parseDouble(System.console().readLine())
println ("Point 1 y coord: ")
upLeft.y = Double.parseDouble(System.console().readLine())

println ("Point 2 x coord: ")
downRight.x = Double.parseDouble(System.console().readLine())
println ("Point 2 y coord: ")
downRight.y = Double.parseDouble(System.console().readLine())

area = Math.abs((upLeft.x - downRight.x) * (upLeft.y - downRight.y))
perimeter = 2*(Math.abs(upLeft


println ("Area = " + area)

