println ("Enter first number: ")
x = Integer.parseInt(System.console().readLine())

println ("Enter second number: ") 
y = Integer.parseInt(System.console().readLine())
int xinit = x
int yinit = y
for (y=1 ; y<=xinit ; ++y) {
	x = x + xinit
}

print (xinit + "x" + yinit + " = " + x) 

	