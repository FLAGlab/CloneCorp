func sumProd(n: Int) {
	var sum = 0.0 //C1
	var prod = 1.0
	for i in 1...n {
		sum = sum + i
		foo(sum, prod)
		prod = prod * i
	}
}