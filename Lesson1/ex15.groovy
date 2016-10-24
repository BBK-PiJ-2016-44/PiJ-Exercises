// ex15 Guess my number


int myNumber = Math.abs(1000 * Math.random())
int x 
boolean gotIt = false

println ("Guess my number!") 
x = Integer.parseInt(System.console().readLine())
while (gotIt == false) {  // Escapes while loop when number is guessed correctly
	if (x < myNumber) { 
		println ("My number is greater than that!")
		x = Integer.parseInt(System.console().readLine()) 
	} else if (x > myNumber) { 
		println ("My number is less than that!")
		x = Integer.parseInt(System.console().readLine())
	} else {
		println ("Got it! My number is " + myNumber) 
		gotIt = true
	}
}