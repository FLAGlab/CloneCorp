fun sumProd(n: Int) {
	var sum = 0.0 //C1
	var prod = 1.0
	for (i in 1..n) {
		if (n % 2 == 0) sum = sum + i
		prod = prod * i
		foo(sum, prod)
	}
}