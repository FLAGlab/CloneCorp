fun sumProd(n: Int) {
	var sum = 0.0 //C1
	var prod = 1.0
	for (i in 1..n) {
		sum = sum + i
		prod = prod * i
		if (n % 2 == 0){ 
			foo(sum, prod)
		}
	}
}