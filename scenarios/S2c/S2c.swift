func sumProd(n: Int) {
	int sum = 0 //C1
	int prod = 1

	for i in 1...n {
		sum = sum + i
		prod = prod * i
		foo(sum, prod)
	}
}