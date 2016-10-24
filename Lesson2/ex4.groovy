//Exercise 4

class Point { 
	double x;
	double y;
}


// Introduce 3 instances of the class 'Point' 

Point a = new Point()
println ("X1 = ")
a.x = Double.parseDouble(System.console().readLine())
println ("Y1 = ")
a.y = Double.parseDouble(System.console().readLine())

Point b = new Point()
println ("X2 = ")
b.x = Double.parseDouble(System.console().readLine())
println ("Y2 = ")
b.y = Double.parseDouble(System.console().readLine())

Point c = new Point()
println ("X3 = ")
c.x = Double.parseDouble(System.console().readLine())
println ("Y3 = ")
c.y = Double.parseDouble(System.console().readLine())


// Work out distances
atob = ((a.x-b.x)**2 + (a.y-b.y)**2)**0.5

atoc = ((a.x-c.x)**2 + (a.y-c.y)**2)**0.5

btoc = ((c.x-b.x)**2 + (c.y-b.y)**2)**0.5


// Compare distances between points 
if ((atob > atoc) && (btoc>atoc)) { 
	println ("a and c are closest")
} else if ((atob>btoc) && (atoc>btoc)) {
	println ("b and c are closest")
} else if ((atoc>atob) && (btoc>atob)) {
	println ("a and b are closest")
} else {println ("They are all equidistant!")} // To catch if all points are equally spaced 



