function sumProd(n) {
	var sum = 0.0;//C1
	var prod = 1.0;	
	for (var i = 1; i <= n; i++) {
		sum = sum + i;
		prod = prod * i;
		if (n % 2 == 0) {
			foo(sum, prod);
		}
	}
}