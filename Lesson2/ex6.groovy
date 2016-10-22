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
rect.upLeft = new Point();
rect.downRight = new Point();

println ("Point 1 x coord: ")
rect.upLeft.x = Double.parseDouble(System.console().readLine())
println ("Point 1 y coord: ")
rect.upLeft.y = Double.parseDouble(System.console().readLine())

println ("Point 2 x coord: ")
rect.downRight.x = Double.parseDouble(System.console().readLine())
println ("Point 2 y coord: ")
rect.downRight.y = Double.parseDouble(System.console().readLine())

area = Math.abs((rect.upLeft.x - rect.downRight.x) * (rect.upLeft.y - rect.downRight.y))
perimeter = 2*(Math.abs(rect.upLeft.x - rect.downRight.x) + Math.abs(rect.upLeft.y - rect.downRight.y))


println ("Area = " + area)
println ("Perimeter = " + perimeter) 


// To access an attribute of a class within a class, use e.g. rect.upLeft.x

Point P = new Point()
println ("Enter the x coord of another point: ")
P.x = Double.parseDouble(System.console().readLine())
println ("Enter the y coord of another point: ")
P.y = Double.parseDouble(System.console().readLine())

if (P.x > rect.upLeft.x  && P.x < rect.downRight.x && P.y > rect.downRight.y && P.y < rect.upLeft.y) {
	println ("That point is inside the rectangle") 
	} else { 
	println ("That point is outside the rectangle") 
} 

