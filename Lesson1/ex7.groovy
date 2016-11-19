// ex7 naive sort 

println "Enter 3 numbers, pressig enter between each number, to be sorted: "
str = System.console().readLine()
int a = Integer.parseInt(str)
str = System.console().readLine()
int b = Integer.parseInt(str)
str = System.console().readLine()
int c = Integer.parseInt(str)

if (a > b) {
	if (a > c) { 
		max = a 
		if (b > c) {
			mid = b 
			min = c
		} else { 
			mid = c
			min = b
		}		
	} else { 
		mid = a
		if (b > c) { 
			max = b
			min = c
		} else { 
			max = c 
			min = b
		}
	}
} else {
	if (b > c) {
		max = b
		if (a > c) { 
			mid = a
			min = c 
		} else { 
			mid = c 
			min = a
		}
	} else { 
		mid = b
		max = c 
		min = a
	}
}


 
println ( min + ", " + mid + ", " + max)
println (" Sorting complete") 


