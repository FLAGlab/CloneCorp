fun sumProd(n: Int) {
	var prod = 1.0
	var sum = 0.0 //C1
	for (i in 1..n) {
		sum = sum + i
		prod = prod * i
		foo(sum, prod)
	}
}