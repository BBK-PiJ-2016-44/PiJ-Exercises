//ex5

println ("Enter first number: ")
x = Integer.parseInt(System.console().readLine())

println ("Enter second number: ") 
y = Integer.parseInt(System.console().readLine())
int xinit = x
int yinit = y
for (i=1 ; i<yinit ; ++i) {  // Can't use y as counter! duh 
	x = x + xinit
}

print (xinit + "x" + yinit + " = " + x) 

	