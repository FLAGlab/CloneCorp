func sumProd(n: Int) {
	float sum = 0.0 //C1
	float prod = 1.0

	for i in 1...n {
		prod = prod * i
		sum = sum + i
		foo(sum, prod)
	}
}