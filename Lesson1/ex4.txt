int flag = 0

println ("Enter a number: ")
String str = System.console().readLine()
num = Integer.parseInt(str)

for (x = 2; x<=(num/2);++x)
	if (num%x == 0) {
	flag = 1
	break
}
if (flag==0) {
	println( num + " is a prime number.")
}
else {
	println( num + " is not prime.")
}




