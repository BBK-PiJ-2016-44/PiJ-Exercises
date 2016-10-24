// ex6 division 


println ("Enter first number: ")
x = Integer.parseInt(System.console().readLine())

println ("Enter second number: ") 
y = Integer.parseInt(System.console().readLine())

int xinit = x
int yinit = y
int quotient = 0
int remainder = xinit


while (remainder >= yinit) { 
	remainder -= yinit      // Iterative process that takes away y from x each iteration, until y is greater than x, and what is left over is remainder
	quotient++
}

print (xinit + "/" + yinit + " = " + quotient + " remainder " + remainder)

 

	