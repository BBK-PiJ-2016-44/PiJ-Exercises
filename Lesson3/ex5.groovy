// Exercise 5 More on Points

class Point {
	double x;
	double y;
	
	double distanceTo(Point p) {
		return ((x-p.x)**2 + (y-p.y)**2)**0.5;
	} 

	double distanceToOrigin() { 
		Point origin = new Point()
		origin.x = 0
		origin.y = 0 
		return distanceTo(origin) 
	} 

	void moveTo(double x, double y) {
		this.x = x
		this.y = y 
	} 

	void moveTo(Point newPoint) { 
		this.x = newPoint.x
		this.y = newPoint.y
	} 

	Point clone () { 
		Point newPoint = new Point()
		newPoint.x = this.x 
		newPoint.y = this.y 
		return newPoint
	} 

	Point opposite () { 
		Point newPoint = new Point() 
		newPoint.x = -this.x
		newPoint.y = -this.y
		return newPoint
	} 
}

// Program ************************************************
// User enters coordinates of 2 points

Point myPoint1 = new Point() 
println ("Choose point 1 x coordinate: ") 
myPoint1.x = Double.parseDouble(System.console().readLine()) 
println ("Choose point 1 y coordinate: ") 
myPoint1.y = Double.parseDouble(System.console().readLine())

Point myPoint2 = new Point()
println ("Choose point 2 x coordinate: ") 
myPoint2.x = Double.parseDouble(System.console().readLine()) 
println ("Choose point 2 y coordinate: ") 
myPoint2.y = Double.parseDouble(System.console().readLine())


println(" Test distanceTo()")
double dist1 = myPoint1.distanceTo(myPoint2) 
println ("Distance between (" + myPoint1.x + ", " + myPoint1.y + ") and (" + myPoint2.x + ", " + myPoint2.y + ") = " + dist1)

println(" Test distanceToOrigin()")
double dist2 = myPoint1.distanceToOrigin() 
println ("Distance from (" + myPoint1.x + ", " + myPoint1.y + ") to origin = " + dist2) 

println(" Test moveTo(x,y)")
println ("myPoint1 is at (" + myPoint1.x + ", " + myPoint1.y + ")") 
myPoint1.moveTo(10, 10) 
println ("myPoint1 is now at (" + myPoint1.x + ", " + myPoint1.y + ")")

println(" Test moveTo(Point)")
println ("myPoint2 is at (" + myPoint2.x + ", " + myPoint2.y + ")") 
myPoint2.moveTo(myPoint1) 
println ("myPoint2 is now at (" + myPoint2.x + ", " + myPoint2.y + ")")

println(" Test clone()")
println ("myPoint3 doesn't exist..yet") 
myPoint3 = myPoint1.clone()
println ("myPoint3 is at (" + myPoint3.x + ", " + myPoint3.y + ")")

println(" Test opposite()")
println ("myPoint2 is at (" + myPoint2.x + ", " + myPoint2.y + ")") 
myPoint2 = myPoint2.opposite()
println ("myPoint2 is now at (" + myPoint2.x + ", " + myPoint2.y + ")")

