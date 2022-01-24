MODULE S4e;
	PROCEDURE sumProd(n : INTEGER);
	VAR 
		sum, prod : REAL;
		i : INTEGER;
	BEGIN
		sum := 0.0; (*C1*)
		prod := 1.0;
		i := 1;
		sum := sum + i;
		prod := prod * i;
		foo(sum, prod);
	END sumProd;
END S4e.