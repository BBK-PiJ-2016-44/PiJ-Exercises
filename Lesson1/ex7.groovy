str = System.console().readLine()
int first = Integer.parseInt(str)
str = System.console().readLine()
int second = Integer.parseInt(str)
str = System.console().readLine()
int third = Integer.parseInt(str)

if (first < second) {
	if (first < third) { 
		if (second < third) {
			print first + "," + second + "," + third
		}else {
			print first + "," + third + "," + second
		}	
	}
}

println "Sorting complete"

