//Exercise 2 

double x
double y
double result
String operation

println ("Enter first number: ") 
x = Double.parseDouble(System.console().readLine())
println ("Enter second number: ")
y = Double.parseDouble(System.console().readLine())

println("Choose an operation: ") 
operation = System.console().readLine()

switch (operation) {
	case "add":		
		result = x + y 
		break
 	case "sub":
		result = x - y 
		break
	case "mul":
		result = x * y 
		break 
	case "div":
		if (y == 0) {
			println("Can't divide by zero")
		} else {		
			result = x / y 
		}
		break
	default: 
		println ("Invalid entry")
		
}
println ("Result = " + result) 

