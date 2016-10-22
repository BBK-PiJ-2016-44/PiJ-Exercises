// ex8 Print max number in a user entered sequence

println "Enter positive numbers, -1 to stop entering" 
int x 
int xmax = 0

x = Integer.parseInt(System.console().readLine())

while (x != -1) { 
	if (x > xmax) { 
		xmax = x // Override the previous largest number
	}
	x = Integer.parseInt(System.console().readLine()) // Get the next entered number	
}
	

println ("The largest number was " + xmax) 

	