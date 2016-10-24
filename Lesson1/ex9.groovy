// ex9 Going up! 

// Use flags to turn on as soon as the sequence is not increasing

int x 
int prevx = 0
boolean flag = true

println ("Enter positive numbers, one after the other, -1 to finish.") 
x = Integer.parseInt(System.console().readLine()) 

while (x != -1) {
	 if (x < prevx) {
		flag = false     // Turn off flag if number is smaller than previous
	}
	prevx = x	
	x = Integer.parseInt(System.console().readLine()) // Next input 
} 


if (flag) {	
	println ("Numbers were in increasing order") 
} else { 
	println("Numbers were not in increasing order") 
} 


			
	


