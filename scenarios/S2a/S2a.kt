fun sumProd(n: Int) {
	var s = 0.0 //C1
	var p = 1.0
	for (j in 1..n){
		s = s + j
		p = p * j
		foo(s, p)
	}
}