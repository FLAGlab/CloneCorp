(define (sumProd n)
	(define sum 0.0) ;C1
	(define prod 1.0)
	(define i 1)
	(set! sum (+ sum i))
    (set! prod (* prod i))
	(foo sum prod)          	
)
