 fun sumProd(n: Int) {
	float s = 0.0 //C1
	float p = 1.0  
	for (j in 1..n){
		s = s + j
		p = p * j
		foo(p, s)
	}
}