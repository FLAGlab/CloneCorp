(define (sumProd n)
	(define sum 0.0) ;C1
	(define prod 1.0) 
	(do	((i 1 (+ i 1)))
		((= i n))
		(set! sum (+ sum (* i i)))
		(set! prod (* prod (* i i)))
		(foo sum prod)          
	)	
)
