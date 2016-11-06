// Exercise 2 



int[] symArray = [1,3,4,5,8,5,4,3,1]
int[] nonSymArray = [1,5,8,5,4,3,1] 

ArrayChecker myChecker = new ArrayChecker()

print symArray
println ("")
print "First array: "
//myChecker.printArray(myChecker.checkAndReverse(symArray)) 
print(myChecker.checkAndReverse(symArray))

println("")
print nonSymArray
println ("")
print "Second array: " 
//myChecker.printArray(myChecker.checkAndReverse(nonSymArray)) 
print(myChecker.checkAndReverse(nonSymArray))
