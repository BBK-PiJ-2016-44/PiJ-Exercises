// ex10 Consecutive sequence tester

// Use flags to turn on as soon as the sequence is not consecutive 


int x 
int prevx = 0
boolean flag = true
boolean first = true

println ("Enter positive numbers, one after the other, -1 to finish.") 
x = Integer.parseInt(System.console().readLine()) 

while (x != -1) {
	if (first == false) {
		 if (x != prevx + 1 ) and (x != prevx - 1) {
			flag = false
		}
	}
	prevx = x 
	x = Integer.parseInt(System.console().readLine())
	
} 


if (flag) {	
	println ("Numbers were consecutive") 
} else { 
	println("Numbers were not consecutive") 
} 	


			
	
	